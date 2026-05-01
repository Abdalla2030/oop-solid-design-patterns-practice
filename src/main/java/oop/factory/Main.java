package main.java.oop.factory;

import main.java.oop.model.room.Room;

public class Main {

    public static void main(String[] args) {

        RoomFactory roomFactory = new RoomFactory();

        Room singleRoom = roomFactory.createRoom(RoomType.SINGLE, 1, 1, 200);
        Room doubleRoom = roomFactory.createRoom(RoomType.DOUBLE, 2, 2, 300);
        Room suiteRoom = roomFactory.createRoom(RoomType.SUITE, 3, 3, 500);

        System.out.println(singleRoom.getNumber() + " " + singleRoom.getNumber());
        System.out.println(doubleRoom.getNumber() + " " + doubleRoom.getNumber());
        System.out.println(suiteRoom.getNumber() + " " + suiteRoom.getNumber());
    }
}
