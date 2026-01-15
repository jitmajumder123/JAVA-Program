package HAS_ARelation;

//Composition
//Composition is a HAS-A relationship where the contained object is fully managed by the container
// and cannot exist on its own.
//Composition is a strong form of the HAS-A relationship.
class Bookk {
    Chapter chapter = new Chapter();
}

class Chapter {
    String title;
    String content;
}

public class Composition {
    public static void main(String[] args) {

        // Create a book and add the chapter
        Bookk myBook = new Bookk();
        myBook.chapter.title = "Introduction to Java";
        myBook.chapter.content = "Java is a high-level programming language...";

        // Read the chapter
        System.out.println("Reading Chapter: " + myBook.chapter.title);
        System.out.println("Content: " + myBook.chapter.content);
    }
}

