package main.java.oop.management.cloud;

import main.java.oop.management.abstraction.correct.RoomDataAccessManager;
import main.java.oop.model.room.Room;

import java.util.Collections;
import java.util.List;

public class RoomCloudDataAccess implements RoomDataAccessManager {
    private List<Room> rooms = new java.util.ArrayList<>();

    @Override
    public void addRoom(Room newRoom) {
        rooms.add(newRoom);
    }

    @Override
    public void removeRoom(int roomNumber) {
        rooms.removeIf(room -> room.getNumber() == roomNumber);
    }

    @Override
    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new java.util.ArrayList<>();
        for (Room room : rooms) {
            if (!room.isReserved()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    @Override
    public Room getRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}
