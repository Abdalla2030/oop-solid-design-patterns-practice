package main.java.oop.model;

import java.time.LocalDate;

public class Reservation {
    private LocalDate reservationStartDate;
    private LocalDate reservationEndDate;

    public Reservation(LocalDate start, LocalDate end) {
        this.reservationStartDate = start;
        this.reservationEndDate = end;
    }

    public LocalDate getReservationStartDate() {
        return reservationStartDate;
    }

    public void setReservationStartDate(LocalDate reservationStartDate) {
        this.reservationStartDate = reservationStartDate;
    }

    public LocalDate getReservationEndDate() {
        return reservationEndDate;
    }

    public void setReservationEndDate(LocalDate reservationEndDate) {
        this.reservationEndDate = reservationEndDate;
    }
}
