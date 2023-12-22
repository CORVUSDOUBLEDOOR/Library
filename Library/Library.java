package Library;

public class Library {
    private Book[] book;
    public Library(Book[]book){
        this.book = book;
    }
    public int searchBook(String wantB){
        for(int i = 0; i < book.length; i++){
            if(wantB.equalsIgnoreCase(book[i].getBookID()) || wantB.equalsIgnoreCase(book[i].getTitle())){
                return i;
            }
        }
        return -1;
    }
    public void borrowBook(String wantB){
        int index = searchBook(wantB);
        if (index != -1) {
            if (book[index].getStatus() == 'A') {
                System.out.println(wantB+" can borrow " + book[index].getTitle());
                book[index].updateStatus();
            } else {
                System.out.println(book[index].getTitle() + " is borrowing. Sorry!");
            }
        } else {
            System.out.println("Sorry, This book cannot be found in our library.");
        }
    }
    public void returnBook(String wantB){
        int index = searchBook(wantB);
        if (index != -1) {
            if (book[index].getStatus() == 'A') {
                System.out.println("This book is not borrowed. Re-input again!.");
            } else {
                System.out.println("Thank you, the return successful.");
                book[index].updateStatus();
            }
        } else {
            System.out.println("This book cannot be found in our library.");
        }
    }
    public void showAllBook(int index){
        System.out.println("These are all books in our library.");
        System.out.println(book[index].toString());

    }
}
