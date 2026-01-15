package Inheritance;

//Covariant Return Types

//A covariant return type occurs when the child class method’s return type is a subclass or a more specific type
// of the return type in the parent class method.
class Animall{
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Lion extends Animall{

}
class Parent{
    Animall display(){
        Animall a = new Animall();
        System.out.println("Hi");
        return a;
    }
}
class Child extends Parent{
    @Override
    Lion display() {  //Animall display() is possible
        Lion l = new Lion();
        System.out.println("Hello");
        return l;
    }
}
public class Covariant {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
