package main.java.oop.model;

import main.java.oop.db.DataStore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Room {

    private int number;
    private int numberOfBeds;
    private double price;
    private boolean isReserved;

    public Room(int number, int numberOfBeds, double price) {
        this.number = number;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}
