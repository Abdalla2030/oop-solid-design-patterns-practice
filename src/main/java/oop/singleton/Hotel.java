package main.java.oop.singleton;

public class Hotel {

    private static Hotel instance;

    private String name;

    private Hotel(String name) {
        this.name = name;
    }

    public static Hotel getInstance() {
        if (instance == null) {
            instance = new Hotel("OOP");
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
