package main.java.oop.db;

import java.util.ArrayList;
import java.util.List;
import main.java.oop.model.room.Room;
import main.java.oop.model.Meal;
import main.java.oop.model.Order;

public class DataStore {

    private List<Room> rooms = new ArrayList<>();

    private List<Meal> meals = new ArrayList<>();

    private List<Order> orders = new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
