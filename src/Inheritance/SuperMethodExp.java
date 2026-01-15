package Inheritance;


class Vehiclee {
    String make;
    String model;
    int year;

    public Vehiclee(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
class Carr extends Vehiclee {
    int seatingCapacity;

    public Carr(String make, String model, int year, int seatingCapacity) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
    }
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

class Truck extends Vehiclee {
    double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }
        public void displayDetails() {
            System.out.println("Truck Make: " + make);
            System.out.println("Truck Model: " + model);
            System.out.println("Manufacturing Year:" + year);
            System.out.println("Payload Capacity:" + payloadCapacity + "tons");
        }
    }
    public class SuperMethodExp {
        public static void main(String[] args) {
            Carr myCar = new Carr("Toyota", "Corolla", 2021, 5);
            Truck myTruck = new Truck("Ford", "F-150", 2019, 1.2);
            myCar.displayDetails();
            myTruck.displayDetails();

        }
    }