package main.java.oop.singleton;

public class Main {

    public static void main(String[] args) {

        Hotel h1 = Hotel.getInstance();
        Hotel h2 = Hotel.getInstance();

        System.out.println(h1 == h2); // true
        System.out.println(h1.getName());
    }
}
