package Constructor;

//Default constructor
//A constructor with no parameters. It sets default values.
class Student1 {
    String name;
    int age;

    // Default constructor
    Student1() {
        name = "Not Assigned";
        age = 0;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class DefaultCons {
    public static void main(String[] args) {
        Student1 s1 = new Student1();  // Calls default constructor
        s1.showDetails();
    }
}
