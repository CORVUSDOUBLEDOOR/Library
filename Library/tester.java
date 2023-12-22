package Library;
import java.util.Scanner;
public class tester {
    public static void main(String[] args) {
        Book[] book = {
                new Book("100","Programming","John"),
                new Book("200","Object-Oriented Programming","May"),
                new Book("300","Graphic","Marry"),
                new Book("400","Statistics","Martin"),
                new Book("500","Database","john")
        };
        Library library = new Library(book);
        Scanner kb = new Scanner(System.in);
        while(true){
            System.out.println("<=== Enter the number what do you want to do ===>");
            System.out.println("1. Borrow a book.");
            System.out.println("2. Return a book.");
            System.out.println("3. Search a book.");
            System.out.println("4. Quit the system.");
            System.out.print("Select = ");
            String select = kb.nextLine().toUpperCase();
            if(select.equals("1")){
                System.out.print("Enter [id/title] of book : ");
                String borrowInput = kb.nextLine();
                library.borrowBook(borrowInput);
            }else if(select.equals("2")){
                System.out.print("Enter [id/title] of book : ");
                String returnBookInput = kb.nextLine();
                library.returnBook((returnBookInput));
            }else if(select.equals("3")){
                System.out.print("Enter [id/title] of book : ");
                String searchBookInput = kb.nextLine();
                int index = library.searchBook(searchBookInput);
                if(index != -1){
                    library.showAllBook(index);
                }else{
                    System.out.println("this book cannot be found in our library.");
                }
            }else if(select.equals("Q")){
                System.out.println("Thank you");
                System.exit(0);
            }else{
                System.out.println("Input invalid, try again");
            }
        }
    }
}
