package Inheritance;


class Bookk {
    String title;
    String author;
    int year;

    // Constructor to initialize all details
    public Bookk(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("Creating Book: " + this.title + ", " + this.author + ", " + this.year);
    }

    // Constructor with title and author only
    public Bookk(String title, String author) {
        this(title, author, 2020); // Calls the main constructor with a default year
    }

    // Default constructor
    public Bookk() {
        this("Unknown Title", "Unknown Author"); // Calls the constructor with two parameters
    }
}
public class ThisMethod {
    public static void main(String[] args) {
        Bookk myBook = new Bookk(); // Uses default constructor
    }
}