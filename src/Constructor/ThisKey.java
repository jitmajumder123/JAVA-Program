package Constructor;


//this keyword solves the shadowing problem.
class Car {
    String color;
    String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }
    public void display(){
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }
}
public class ThisKey {
    public static void main(String[] args) {
        Car myCar = new Car("Blue", "Honda Civic");
        Car myCar1 = new Car("Red", "Honda City");
       // System.out.println("Car Details: " + myCar.color + " " + myCar.model);

        myCar.display();
        myCar1.display();
    }
}

