package Constructor;


//shadowing problem.
// This happens when a local variable (like a parameter in a method or constructor)
// has the same name as an instance variable of the class.
class Bike {
    String color;
    String model;
    int gear;

    public Bike(String color, String model, int gear) {
        color = color;  // Problem: Both names are the same
        model = model; // Problem again
        gear = gear;
    }
}
public class ShadowPrblm {
    public static void main(String[] args) {
        Bike myBike = new Bike("Blue", "Ninza Z900",5);
        System.out.println(myBike.color);  // Output: null
        System.out.println(myBike.model);  // Output: null
        System.out.println(myBike.gear);   // Output: 0
    }
}
