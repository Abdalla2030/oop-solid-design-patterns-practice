package main.java.oop.model.room;


public abstract class Room {

    private int number;
    private double price;
    private String type;
    private boolean isReserved;

    public Room(int number, double price) {
        this.number = number;
        this.price = price;
        this.isReserved = false;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void reserveRoom() {

        this.isReserved = true;
    }

    public void freeRoom() {

        this.isReserved = false;
    }

    public abstract double calculateTotalAmount(int numberOfDays);


}
