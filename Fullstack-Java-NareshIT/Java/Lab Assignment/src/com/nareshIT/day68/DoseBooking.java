package com.nareshIT.day68;

public class DoseBooking {
    private boolean booked = false;

    public synchronized void bookDose() {
        if (booked) {
            throw new RuntimeException("Dose already booked.");
        } else {
            booked = true;
        }
    }

    public boolean isDoseBooked() {
        return booked;
    }
}
