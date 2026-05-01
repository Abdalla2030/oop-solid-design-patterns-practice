package main.java.oop.factory;

import main.java.oop.model.room.Room;

public class RoomFactory {

    public Room createRoom(RoomType type, int number, int beds, double price) {

        switch (type) {
            case SINGLE:
                return new Room(number, 1, price);

            case DOUBLE:
                return new Room(number, 2, price);

            case SUITE:
                return new Room(number, beds, price);

            default:
                throw new IllegalArgumentException("Invalid room type");
        }
    }
}
