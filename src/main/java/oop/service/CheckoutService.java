package main.java.oop.service;

import main.java.oop.model.reservation.Reservation;

public class CheckoutService {

    public double checkoutReservation(Reservation reservation) {

        double totalAmount = reservation.calculateTotalAmount();

        reservation.getRoom().freeRoom();

        return totalAmount;
    }
}
