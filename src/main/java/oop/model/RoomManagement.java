package main.java.oop.model;

import main.java.oop.db.DataStore;

import java.util.ArrayList;
import java.util.List;

public class RoomManagement {

    DataStore dataStore = new DataStore();

    public RoomManagement(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    void addRoom(int roomNumber, int numberOfBeds, double price) {

        Room newRoom = new Room(roomNumber, numberOfBeds, price);

        dataStore.getRooms().add(newRoom);
    }

    void removeRoom(int roomNumber) {

        for (Room room : dataStore.getRooms()) {
            if (room.getNumber() == roomNumber) {
                dataStore.getRooms().remove(room);
            }
        }
    }

    List<Room> getAvailableRooms() {

        List<Room> availableRooms = new ArrayList<>();

        for (Room room : dataStore.getRooms()) {
            if (!room.isReserved()) {
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }

    void reserveRoom(int roomNumber, int reservationDays, String customerName, String customerId) {

        Room selectedRoom = null;

        for (Room room : dataStore.getRooms()) {
            if (room.getNumber() == roomNumber) {
                selectedRoom = room;
            }
        }

        selectedRoom.setReserved(true);
    }

    void freeRoom(int roomNumber) {

        Room selectedRoom = null;

        for (Room room : dataStore.getRooms()) {
            if (room.getNumber() == roomNumber) {
                selectedRoom = room;
            }
        }

        selectedRoom.setReserved(false);
    }


    public DataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(DataStore dataStore) {
        this.dataStore = dataStore;
    }
}
