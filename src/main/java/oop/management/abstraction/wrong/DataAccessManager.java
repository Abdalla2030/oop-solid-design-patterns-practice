package main.java.oop.management.abstraction.wrong;

import main.java.oop.model.Meal;
import main.java.oop.model.room.Room;

import java.util.List;

public interface DataAccessManager {

    public void removeRoom(int roomNumber);

    public void addRoom(Room newRoom);

    public List<Room> getAvailableRooms();

    public void removeMeal(String name);

    public void addMeal(Meal meal);

    Meal searchByName(String name);

}
