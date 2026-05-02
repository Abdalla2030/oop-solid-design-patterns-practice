package main.java.oop.db;

import java.util.ArrayList;
import java.util.List;

import main.java.oop.model.Customer;
import main.java.oop.model.Menu;
import main.java.oop.model.reservation.Reservation;
import main.java.oop.model.room.Room;
import main.java.oop.model.Meal;
import main.java.oop.model.Order;

public class DataStore {

    private List<Room> rooms = new ArrayList<>();

    private Menu menu = new Menu();

    private List<Reservation> reservations = new ArrayList<>();

    private List<Customer> customers = new ArrayList<>();

    private List<Order> orders = new ArrayList<>();



    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
