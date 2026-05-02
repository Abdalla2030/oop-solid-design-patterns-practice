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
import main.java.oop.model.reservation.Reservation;
import main.java.oop.model.reservation.UncancellableReservation;
import main.java.oop.model.room.DoubleRoom;
import main.java.oop.model.room.SingleRoom;
import main.java.oop.model.room.Room;
import main.java.oop.model.room.SweetRoom;

import java.time.LocalDate;
import java.util.Scanner;

public class HMSRunner {

    public static void main(String[] args) {

        Room room = new DoubleRoom(1, 200.0);
        Customer customer = new Customer("Abdalla", "1" );

        Reservation reservation1 = new CancelableReservation(
                room,
                customer,
                LocalDate.now(),
                LocalDate.now().plusDays(3)
        );

        Reservation reservation2 = new UncancellableReservation(
                room,
                customer,
                LocalDate.now(),
                LocalDate.now().plusDays(3)
        );

        System.out.println("Cancelable: " + reservation1.calculateRoomReservationAmount());
        System.out.println("Uncancellable: " + reservation2.calculateRoomReservationAmount());

    }
}
