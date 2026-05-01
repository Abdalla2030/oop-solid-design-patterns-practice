package main.java.oop.factory;

import main.java.oop.model.room.DoubleRoom;
import main.java.oop.model.room.Room;
import main.java.oop.model.room.SingleRoom;
import main.java.oop.model.room.SweetRoom;

public class RoomFactory {

    public Room createRoom(RoomType type, int number, int beds, double price) {

        switch (type) {
            case SINGLE:
                return new SingleRoom(number, price);

            case DOUBLE:
                return new DoubleRoom(number, price);

            case SUITE:
                return new SweetRoom(number, price, "default");

            default:
                throw new IllegalArgumentException("Invalid room type");
        }
    }
}
