package Inheritance;

//Multilevel inheritance is when a class inherits from a class,
// which itself inherits from another class. It forms a chain of inheritance.
class Employee {
    String name;
    int employeeId;

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}
class Manager extends Employee {
    int teamSize;

    public void displayManagerDetails() {
        displayEmployeeDetails(); // Calling method from Employee class
        System.out.println("Manages team of size: " + teamSize);
    }
}
class SeniorManager extends Manager {
    String project;

    public void displaySeniorManagerDetails() {
        displayManagerDetails(); // Calling method from Manager class
        System.out.println("Project: " + project);
    }
}
public class MultiLevelInheri {
    public static void main(String[] args) {
        SeniorManager seniorManager = new SeniorManager();
        seniorManager.name = "Alice";
        seniorManager.employeeId = 1001;
        seniorManager.teamSize = 10;
        seniorManager.project = "Project Backend";
        seniorManager.displaySeniorManagerDetails();
    }
}
