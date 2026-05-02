package main.java.oop.util;

import main.java.oop.model.room.Room;

import java.util.List;

public class ConsoleRoomDisplay implements RoomDisplay {

    public void displayRooms(List<Room> rooms) {

        System.out.println("room number" + "   " + "room type" + "   " + "price");

        for (Room room : rooms) {

            System.out.println(room.getNumber() + "\t\t\t\t" + room.getType() + "\t\t\t\t" + room.getPrice());
        }
    }
}
