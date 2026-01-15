package Constructor;

// Constructor and Static Block Execution Order
// static block → main() → instance block → constructor
// instance variables. -> instance block.-> constructor

public class ConstExecution {
    static int staticVar = 5;

    static {
        System.out.println("Static block executed. staticVar = " + staticVar);
    }

    int instanceVar = 20;

    {
        System.out.println("Instance block executed. instanceVar = " + instanceVar);
    }

    public ConstExecution() {
        System.out.println("Constructor executed. instanceVar = " + instanceVar);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");
        ConstExecution obj = new ConstExecution();
    }
}