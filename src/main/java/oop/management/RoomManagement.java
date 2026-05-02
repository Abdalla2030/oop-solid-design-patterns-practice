package main.java.oop.management;

import main.java.oop.db.DataStore;
import main.java.oop.management.abstraction.correct.RoomDataAccessManager;
import main.java.oop.model.room.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomManagement implements RoomDataAccessManager {

    private DataStore dataStore;

    public RoomManagement(DataStore dataStore) {

        this.dataStore = dataStore;
    }

    public void addRoom(Room newRoom) {

        dataStore.getRooms().add(newRoom);
    }

    public void removeRoom(int roomNumber) {

        for(Room room : dataStore.getRooms()) {

            if(room.getNumber() == roomNumber) {

                dataStore.getRooms().remove(room);
            }
        }
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for(Room room : dataStore.getRooms()) {

            if(!room.isReserved()) {

                availableRooms.add(room);
            }
        }
        return  availableRooms;
    }

    @Override
    public Room getRoomByNumber(int roomNumber) {
        for(Room room : dataStore.getRooms()) {

            if(room.getNumber() == roomNumber){

                return room;
            }
        }
        return null;
    }

}
