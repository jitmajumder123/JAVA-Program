package Constructor;

//Constructor overloading means writing multiple constructors in the same class,
// each with a different set of parameters.

class Message {
    // Constructor 1: No parameters
    public Message() {
        System.out.println("Default Message: Hello!");
    }

    // Constructor 2: One string parameter
    public Message(String msg) {
        System.out.println("Message: " + msg);
    }

    // Constructor 3: One string and one integer
    public Message(String msg, int times) {
        System.out.println("Message: " + msg);
        System.out.println("Reminders: " + times);
    }
}
public class ConstOverload {
    public static void main(String[] args) {
        Message defaultMsg = new Message();                     // Uses default constructor
        Message personalMsg = new Message("Hi, how are you?");  // Uses constructor with one parameter
        Message reminderMsg = new Message("Kindly pay bill", 3); // Uses constructor with two parameters
    }
}
