package Constructor;

//A copy constructor in Java is a special constructor that takes another object of the same class
// as its parameter and copies its values into the new object.
//*A constructor that takes an object of the same class and copies its data into a new object.

class Book {
    String title;
    int pages;

    // Standard constructor
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // Copy constructor
    public Book(Book another) {
        this.title = another.title;
        this.pages = another.pages;
    }

    public void display() {
        System.out.println("Book: " + title + ", Pages: " + pages);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Book originalBook = new Book("Java Fundamentals", 300);
        originalBook.display();

        Book copiedBook = new Book(originalBook);  // Copying using the copy constructor
        copiedBook.display();

        // Changing the copied book
        copiedBook.pages = 350;

        System.out.println("After modifying the copied book:");
        copiedBook.display();
        originalBook.display();
    }
}
