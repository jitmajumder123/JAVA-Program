package Inheritance;

//Method overriding is when a subclass provides its own implementation of a method that is already defined in its superclass.
// The method in the subclass must have the same name, return type, and parameters

//public to public
/*class Parent {
    public void makeChai() {
        System.out.println("Boil water, add tea leaves, sugar, and milk.");
    }
}

class Child extends Parent {
    @Override
    public void makeChai() {
        System.out.println("Boil water, add tea leaves, sugar, milk, ginger, and cardamom.");
    }
}

//Protected to public
class Parent {
    protected void makeChai() {
        System.out.println("Boil water, add tea leaves, sugar, and milk.");
    }
}

class Child extends Parent {
    @Override
    public void makeChai() {
        System.out.println("Boil water, add tea leaves, sugar, milk, ginger, and cardamom.");
    }
}

//Default to protected
class Parent {
    void makeChai() { // Default access
        System.out.println("Boil water, add tea leaves, sugar, and milk.");
    }
}

class Child extends Parent {
    @Override
    protected void makeChai() {
        System.out.println("Boil water, add tea leaves, sugar, milk, ginger, and cardamom.");
    }
}

//Default to private
class Parent {
    void makeChai() { // Default access
        System.out.println("Boil water, add tea leaves, sugar, and milk.");
    }
}

class Child extends Parent {
    @Override
    private void makeChai() { // Error: Cannot reduce visibility
        System.out.println("Boil water, add tea leaves, sugar, milk, ginger, and cardamom.");
    }
}*/
public class MAccessModifier {
    public static void main(String[] args) {
        System.out.println("Access Modifier");
    }
}
