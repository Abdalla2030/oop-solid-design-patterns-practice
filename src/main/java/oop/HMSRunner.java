package main.java.oop;

import main.java.oop.db.DataStore;
import main.java.oop.management.MenuManagement;
import main.java.oop.management.ReservationManagement;
import main.java.oop.management.RoomManagement;
import main.java.oop.management.abstraction.correct.MenuDataAccessManager;
import main.java.oop.management.abstraction.correct.RoomDataAccessManager;
import main.java.oop.model.Customer;
import main.java.oop.model.Meal;
import main.java.oop.model.reservation.CancelableReservation;
import main.java.oop.model.room.DoubleRoom;
import main.java.oop.model.room.SingleRoom;
import main.java.oop.model.room.Room;
import main.java.oop.model.room.SweetRoom;

import java.time.LocalDate;
import java.util.Scanner;

public class HMSRunner {

    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
        RoomDataAccessManager roomManagement = new RoomManagement(dataStore);
        MenuDataAccessManager menuManagement = new MenuManagement(dataStore);

        roomManagement.addRoom(new DoubleRoom(1, 250.0));
        roomManagement.addRoom(new SingleRoom(2, 350.0));
        roomManagement.addRoom(new SweetRoom(3, 1000.0, "air condition - SPA - BLA BLA"));
        roomManagement.addRoom(new DoubleRoom(4, 200.0));

        menuManagement.addMeal(new Meal("rice", "rice with meat", 300.0));
        menuManagement.addMeal(new Meal("pasta", "pasta with meat", 350.0));

    }
}
