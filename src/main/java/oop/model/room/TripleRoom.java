package main.java.oop.model.room;

public class TripleRoom extends Room {

    public TripleRoom(int number, double price) {
        super(number, price);
        this.setType("Triple Room");
    }

    @Override
    public double calculateTotalAmount(int numberOfDays) {
        return numberOfDays * getPrice() * 20;
    }
}
