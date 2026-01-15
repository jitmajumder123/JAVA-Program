package Inheritance;

// Parent class
class Player {
    String hobby = "sports";
    public void play() {
        System.out.println("Play sports!");
    }
}
// Child class
class Cricketer extends Player {
    // Inherits everything from Player
}
// Child class
class Footballer extends Player {
    // Inherits everything from Player
}
public class SingleInheri {
    public static void main(String[] args) {
        Cricketer c = new Cricketer();
        System.out.println("Cricketer's hobby: " + c.hobby);
        c.play();

        Footballer f = new Footballer();
        System.out.println("Footballer's hobby: " + f.hobby);
        f.play();
    }
}