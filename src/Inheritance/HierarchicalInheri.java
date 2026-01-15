package Inheritance;

// Hierarchical inheritance
// Hierarchical inheritance is a type of inheritance where two or more classes inherit from the same base class.
class User {
    String name;
    int userId;

    public void displayUserDetails() {
        System.out.println("User ID: " + userId + ", Name: " + name);
    }
}
class Studentt extends User {
    String grade;

    public void displayStudentDetails() {
        displayUserDetails(); // inherited from User
        System.out.println("Grade: " + grade);
    }
}
class Teacher extends User {
    String subject;

    public void displayTeacherDetails() {
        displayUserDetails(); // inherited from User
        System.out.println("Subject: " + subject);
    }
}
public class HierarchicalInheri {
    public static void main(String[] args) {
        Studentt student = new Studentt();
        student.name = "John";
        student.userId = 101;
        student.grade = "A";
        student.displayStudentDetails();

        Teacher teacher = new Teacher();
        teacher.name = "Mr. Smith";
        teacher.userId = 201;
        teacher.subject = "Mathematics";
        teacher.displayTeacherDetails();
    }
}
