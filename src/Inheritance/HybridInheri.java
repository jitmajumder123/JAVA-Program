package Inheritance;

//Hybrid inheritance

//Hybrid inheritance is a type of inheritance where two or more forms of
// inheritance are combined in a single program

class LibraryItem {
    String title;
    String itemId;

    public void displayDetails() {
        System.out.println("Title: " + title + ", Item ID: " + itemId);
    }
}

class Book extends LibraryItem {
    String author;

    public void displayBookDetails() {
        displayDetails();
        System.out.println("Author: " + author);
    }
}

class Magazine extends LibraryItem {
    String issue;

    public void displayMagazineDetails() {
        displayDetails();
        System.out.println("Issue: " + issue);
    }
}

class ScienceBook extends Book {
    String field;

    public void displayScienceBookDetails() {
        displayBookDetails();
        System.out.println("Field: " + field);
    }
}
public class HybridInheri {
    public static void main(String[] args) {
        ScienceBook scienceBook = new ScienceBook();
        scienceBook.title = "Physics Fundamentals";
        scienceBook.itemId = "B1001";
        scienceBook.author = "Dr. Smith";
        scienceBook.field = "Physics";
        scienceBook.displayScienceBookDetails();

        System.out.println("-----");

        Magazine magazine = new Magazine();
        magazine.title = "Tech Monthly";
        magazine.itemId = "M2001";
        magazine.issue = "July 2024";
        magazine.displayMagazineDetails();
    }
}
