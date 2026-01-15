package Inheritance;


class Person {
// Declare name and age attributes
    String name;
    int age;

// Method to display name and age
    public void display() {

    System.out.println("Name: " + name +", Age: " + age);
    }
}
class Student extends Person {
    // Declare student ID attribute
    String studentID;
    // Method to display name, age, and student ID
    @Override

    public void display() {
        System.out.println("Name: " + name + ", Age:" + age + ", Student ID:" + studentID);
    }
}
public class SingleInheriExp {
    public static void main(String[] args) {
// Create instances of Person and Student and display their details
            Person person = new Person();
            person.name = "John";
            person.age = 38;
            person.display();
            Student student = new Student();
            student.name = "Alice";
            student.age = 20;
            student.studentID = "512345";
            student.display();
        }
    }