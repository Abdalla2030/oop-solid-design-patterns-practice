package main.java.oop.builder;

import main.java.oop.model.room.Room;

public class RoomBuilder {

    private int number;
    private int numberOfBeds;
    private double price;
    private boolean isReserved;

    public RoomBuilder setNumber(int number) {
        this.number = number;
        return this;
    }

    public RoomBuilder setBeds(int beds) {
        this.numberOfBeds = beds;
        return this;
    }

    public RoomBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public RoomBuilder setReserved(boolean reserved) {
        this.isReserved = reserved;
        return this;
    }

    public Room build() {
        Room room = new Room(number, numberOfBeds, price);
        room.setReserved(isReserved);
        return room;
    }
}
