package main.java.oop.management.abstraction.correct;

import main.java.oop.model.room.Room;

import java.util.List;

public interface  RoomDataAccessManager {
    void removeRoom(int roomNumber);

    void addRoom(Room newRoom);

    List<Room> getAvailableRooms();

    Room getRoomByNumber(int roomNumber);
}
