package main.java.oop.model.room;

public class DoubleRoom extends Room {

    public DoubleRoom(int number, double price) {
        super(number, price);
        this.setType("Double Room");
    }

    @Override
    public double calculateTotalAmount(int numberOfDays) {
        return numberOfDays * getPrice();
    }

}
