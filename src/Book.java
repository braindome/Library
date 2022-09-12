import java.util.ArrayList;

public class Book {
    String title;
    String author;
    String year;
    String edition;
    boolean status;
    ArrayList<Book> bookList = new ArrayList();

    //Constructor method - add a book
    public Book(String title, String author, String year, String edition) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.status = true;
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
        return title+ " by " + author + ". " + year + ". " + edition + ".";
    }
}