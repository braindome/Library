import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String title;
    String author;
    String year;
    String edition;
    boolean status;

    Scanner sc = new Scanner(System.in);
    ArrayList<Book> bookList = new ArrayList<>();

    //Constructor method - add a book
    public Book(String title, String author, String year, String edition) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.status = true;

    }

    public Book addBook (Book book, ArrayList list) {
        list.add(book);
        System.out.println("Insert book title:");
        this.title = sc.nextLine();
        System.out.println("Insert book author:");
        this.author = sc.nextLine();
        System.out.println("Insert publishing year:");
        this.year = sc.nextLine();
        System.out.println("Insert publisher details:");
        this.edition = sc.nextLine();
        return book;
    }

    public void search (ArrayList list) {
        System.out.println("Enter search string:");
        String searchTerm = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i).toString();
            if (string.contains(searchTerm)) {
                System.out.println(list.get(i) + " is in catalogue. Would you like to loan the book? y/n");
                String answer = sc.nextLine();
                if (answer.equals("y")) {
                    loan(this);
                    System.out.println(this.status);
                }
            }
        }
    }


    public void availableBooks(ArrayList<Book> list) {
        for (Book book : list) {
            if (book.status) {
                System.out.println(book);
            }
        }
    }


    public void loan(Book book) {
        if (this.status) {
            status = false;
            System.out.println("You have loaned the book.");
        } else {
            System.out.println("The book is NOT available.");
        }
    }

    public boolean returnBook() {
        if (!this.status) {
            status = true;
            System.out.println("You have returned the book");
            return true;
        } else {
            System.out.println("You still have the book");
            return false;
        }

    }

    public String toString() {
        return this.title + ". " + this.author + ", " + this.year + ". " + this.edition;
    }

}