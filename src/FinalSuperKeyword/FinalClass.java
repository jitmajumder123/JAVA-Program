package FinalSuperKeyword;

// Final class
final class FinalClassExp {
    void display() {
        System.out.println("This is a method from the final class.");
    }
}

// Trying to extend a final class will result in a compile-time error
// class SubClass extends FinalClass {
//     void display() {
//         System.out.println("Attempting to inherit from a final class.");
//     }
// }

public class FinalClass {
    public static void main(String[] args) {
        FinalClassExp finalClass = new FinalClassExp();
        finalClass.display();
    }
}

