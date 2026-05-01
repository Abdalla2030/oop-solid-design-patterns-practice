package main.java.examples.inheritance;

import main.java.examples.inheritance.birds.Bat;
import main.java.examples.inheritance.birds.Parrot;
import main.java.examples.inheritance.birds.Penguin;
import main.java.examples.inheritance.move.Fly;
import main.java.examples.inheritance.move.Jump;
import main.java.examples.inheritance.move.Walk;

public class ExampleRunner {

    public static void main(String[] args) {

        Fly fly = new Fly();
        Walk walk = new Walk();
        Jump jump = new Jump();


        Parrot parrot = new Parrot("bebo", "blue",fly);
        Penguin penguin = new Penguin("pngo", "white", walk);
        Bat bat = new Bat("batbot", "black", jump);


        System.out.print("I am parrot, ");
        parrot.move();
        System.out.print("I am penguin, ");
        penguin.move();
        System.out.print("I am bat, ");
        bat.move();


        parrot.repeat("Don't repeat after me");

        penguin.swim();
    }
}
