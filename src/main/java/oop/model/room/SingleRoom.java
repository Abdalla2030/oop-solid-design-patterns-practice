package main.java.oop.model.room;

public class SingleRoom extends Room {

    public SingleRoom(int number, double price) {
        super(number, price);
        this.setType("Single Room");
    }

    @Override
    public double calculateTotalAmount(int numberOfDays) {

        return numberOfDays * getPrice() * 15;
    }

    public double calculateTotalAmountWith15Fee(int numberOfDays) {

        return numberOfDays * getPrice() * 15;
    }
}
