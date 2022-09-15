import java.util.ArrayList;
import java.util.Scanner;
//Test 02:33

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Nemesis Games", "James S.A. Corey", "2015","Orbit Books, 2022");
        Book book2 = new Book("The Two Towers", "J.R.R. Tolkien", "1954","60th Anniversary Edition, 2014");
        Book book3 = new Book("The Winds of Winter", "George R.R. Martin", "2057", "Whatever, 2145");

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> catalogue = new ArrayList<>();

        catalogue.add(book1);
        catalogue.add(book2);
        catalogue.add(book3);

        for (int i = 0; i <= catalogue.size()-1; i++) {
            System.out.println(catalogue.get(i));
        }

        System.out.println("Welcome to my library! What would you like to do?");
        System.out.println("1. Add a book to the library.");
        System.out.println("2. Search for a book.");
        System.out.println("3. List all available books.");
        System.out.println("4. Return a book.");
        System.out.println("5. Quit program.");


        while (true) {
            String choice = sc.nextLine();
            Book book = new Book("","","","");
            if (choice.equals("1")) {
                book.addBook(book, catalogue);
                System.out.println("Updated catalogue:");
                for (Book item : catalogue) {
                    System.out.println(item);
                }

            } else if (choice.equals("2")) {
                book.search(catalogue);


            } else if (choice.equals("3")) {
                System.out.println("Available books:");
                for (Book b : catalogue) {
                    if (b.status) {
                        System.out.println(b);
                    }
                }
            } else if (choice.equals("4")) {
                book.returnBook();
                System.out.println("You have returned the book.");
            } else if (choice.equals("5")) {
                System.out.println("Good bye!");
                break;
            }
            System.out.println("What would you like to do now?");

        }


    }


}