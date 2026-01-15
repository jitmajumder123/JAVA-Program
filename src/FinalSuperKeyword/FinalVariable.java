package FinalSuperKeyword;

public class FinalVariable {
    // Final variable
    final int MAX_SPEED = 120;

    public void displaySpeed() {
        // Trying to change the value of a final variable will result in a compile-time error
        // MAX_SPEED = 150; // Uncommenting this line will cause an error
        System.out.println("The maximum speed is: " + MAX_SPEED);
    }

    public static void main(String[] args) {
        FinalVariable example = new FinalVariable();
        example.displaySpeed();
    }
}
