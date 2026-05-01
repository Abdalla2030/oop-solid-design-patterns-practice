package main.java.oop.builder;

import main.java.oop.model.room.Room;

public class Main {

    public static void main(String[] args) {

        Room room = new RoomBuilder()
                .setNumber(1)
                .setBeds(2)
                .setPrice(300)
                .setReserved(true)
                .build();

        System.out.println(room.getNumber() + " " + room.getPrice());
    }
}
