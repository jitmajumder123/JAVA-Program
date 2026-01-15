package Encapsulation;


class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double l) {
        length = (l >= 0) ? l : 0.0;
    }

    public void setWidth(double w) {
        width = (w >= 0) ? w : 0.0;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class AreaCalculate {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setLength(5.0);
        rect1.setWidth(3.0);

        System.out.println("Initial Rectangle Details:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.calculateArea());

        rect1.setLength(7.0);
        rect1.setWidth(-2.0);

    }
}