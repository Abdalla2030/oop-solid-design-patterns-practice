package main.java.oop.model.reservation;

import main.java.oop.model.Customer;
import main.java.oop.model.Order;
import main.java.oop.model.room.Room;

import java.time.LocalDate;

public abstract class Reservation {

    private Room room;
    private Customer customer;
    private LocalDate reservationStartDate;
    private LocalDate reservationEndDate;
    private Order order;

    public Reservation(Room room, Customer customer, LocalDate reservationStartDate, LocalDate reservationEndDate) {
        this.room = room;
        this.customer = customer;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    protected void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getReservationStartDate() {
        return reservationStartDate;
    }

    public void setReservationStartDate(LocalDate reservationStartDate) {
        this.reservationStartDate = reservationStartDate;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public LocalDate getReservationEndDate() {
        return reservationEndDate;
    }

    public void setReservationEndDate(LocalDate reservationEndDate) {
        this.reservationEndDate = reservationEndDate;
    }

    public abstract double calculateRoomReservationAmount();

    public double calculateTotalAmount() {

        return calculateRoomReservationAmount() + order.calculateOrderTotalAmount();
    }

}
