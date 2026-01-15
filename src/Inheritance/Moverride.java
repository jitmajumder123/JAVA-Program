package Inheritance;


class Employeee {
    void work() {
        System.out.println("Employee is working");
    }
    void attendMeeting() {
        System.out.println("Employee is attending a meeting");
    }
}
class Managerr extends Employeee {
    // Overridden method
    void attendMeeting() {
        System.out.println("Manager is leading a meeting");
    }

    // Child-specific method
    void conductReview() {
        System.out.println("Manager is conducting a performance review");
    }
}
public class Moverride {
    public static void main(String[] args) {
        Managerr myManager = new Managerr();

        // Calling the inherited method
        myManager.work();   // Output: Employee is working

        // Calling the overridden method
        myManager.attendMeeting(); // Output: Manager is leading a meeting

        // Calling the child-specific method
        myManager.conductReview();  // Output: Manager is conducting a performance review
    }
}