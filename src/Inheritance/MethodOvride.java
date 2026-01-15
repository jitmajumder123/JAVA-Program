package Inheritance;


class Animal{
    void eat(){
        System.err.println("Animal is eating.");
    }
    void sleep(){
        System.err.println("Animal is sleeping.");
    }
}
class Tiger extends Animal{
    @Override
    void eat(){
        System.err.println("Tiger eats meat.");
    }
    void hunt(){
        System.err.println("Tiger hunts.");
    }
}
class Deer extends Animal{
    @Override
    void eat(){
        System.err.println("Deer eats grass.");
    }
    void run(){
        System.err.println("Deer run faster.");
    }
}
class Monkey extends Animal{
    @Override
    void eat(){
        System.err.println("Monkey eats fruits.");
    }
    void jump(){
        System.err.println("Monkey Jumps across trees.");
    }
}

public class MethodOvride {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.sleep();
        d.eat();
        d.run();
        Tiger t = new Tiger();
        t.sleep();
        t.eat();
        t.hunt();
        Monkey m = new Monkey();
        m.sleep();
        m.eat();
        m.jump();
    }
}