import java.util.ArrayList;
import java.util.Scanner;
//Test 11:40

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Nemesis Games", "James S.A. Corey", "2015","Orbit Books, 2022");
        Book book2 = new Book("The Two Towers", "J.R.R. Tolkien", "1954","60th Anniversary Edition, 2014");
        Book book3 = new Book("The Winds of Winter", "George R.R. Martin", "2057", "Whatever, 2145");

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList();


        System.out.println("Welcome to my library! What would you like to do?");
        System.out.println("1. Add a book to the library.");
        System.out.println("2. Search for a book by name.");
        System.out.println("3. List all available books.");
        System.out.println("4. Return a book.");
        System.out.println("5. Quit program.");

        while (true) {
            String choice = String.valueOf(sc.nextLine());
            if (choice.equals("1")) {

            } else if (choice.equals("2")) {

            } else if (choice.equals("3")) {

            } else if (choice.equals("4")) {

            } else if (choice.equals("5")) {

            }
        }

    }
}