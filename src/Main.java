import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
//Test 11:40

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<Book>();


        System.out.println("Welcome to my library! What would you like to do?");
        System.out.println("1. Add a book to the library.");
        System.out.println("2. Search for a book by name.");
        System.out.println("3. List all available books.");
        System.out.println("4. Return a book.");
        System.out.println("5. Quit program.");

        while (true) {
            String choice = String.valueOf(sc.nextLine());
            if (choice.equals("1")) {
                Book newBook = new Book("", "", "", "", true);
                newBook.addBook(newBook);
                bookList.add(newBook);
                System.out.println(bookList);

            } else if (choice.equals("2")) {
                System.out.println("Insert search string:");
                String input = sc.nextLine();
                bookList.search(input);

                System.out.println("Fuck off");
            } else if (choice.equals("3")) {
                System.out.println("Available books: ");
            }

            //System.out.println("What would you like to do now?");
        }

    }
}