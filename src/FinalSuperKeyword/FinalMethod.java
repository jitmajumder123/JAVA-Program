package FinalSuperKeyword;

class Parent {
    // Final method
    final void show() {
        System.out.println("This is a final method from the Parent class.");
    }
}

class Child extends Parent {
    // Trying to override the final method will result in a compile-time error
    // void show() {
    //     System.out.println("Attempting to override the final method.");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

