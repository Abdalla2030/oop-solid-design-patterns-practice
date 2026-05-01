package main.java.oop;

import main.java.oop.model.Customer;
import main.java.oop.model.reservation.CancelableReservation;
import main.java.oop.model.room.SingleRoom;
import main.java.oop.model.room.Room;

import java.time.LocalDate;

public class HMSRunner {

    public static void main(String[] args) {

        Room room = new SingleRoom(1, 200);

        Customer customer = new Customer("ahmed", "123");

        CancelableReservation reservation =
                new CancelableReservation(
                        room,
                        customer,
                        LocalDate.now(),
                        LocalDate.now().plusDays(3)
                );

        System.out.println(reservation.calculateTotalAmount());
    }
}
