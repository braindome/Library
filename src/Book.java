import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String title;
    String author;
    String year;
    String edition;
    boolean status;
    ArrayList<Book> bookList = new ArrayList();
    Scanner sc = new Scanner(System.in);

    //Constructor
    public Book(String title, String author, String year, String edition, boolean status) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.status = true;
    }

    public void addBook(Book id) {
        bookList.add(id);
        System.out.println("Insert book title:");
        setTitle(sc.nextLine());
        System.out.println("Insert author name:");
        setAuthor(sc.nextLine());
        System.out.println("Insert publication year:");
        setYear(sc.nextLine());
        System.out.println("Insert publisher details:");
        setEdition(sc.nextLine());

    }

    public void search(String input) {
        for (Book book : bookList) {
            if (bookList.contains(input)) {
                System.out.println("The requested title is in the library and available.");
            } else {
                System.out.println("The book is not available or not in catalogue.");
            }
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean loan() {
        if (status) {
            this.status = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook() {
        if (!status) {
            this.status = true;
            return false;
        } else {
            return true;
        }

    }

    public String toString() {
        return author + ". " + title + ". " + year + ". " + edition + ".";
    }
}