package com.nareshIT.day68;

public class User {
    private String name;
    private VaccineEligibility eligibility;
    private DoseBooking doseBooking;

    public User(String name, int age, boolean hasHealthCondition) {
        this.name = name;
        this.eligibility = new VaccineEligibility(age, hasHealthCondition);
        this.doseBooking = new DoseBooking();
    }

    public void isEligible() {
        try {
            eligibility.isEligible();
        } catch (Eligible e) {
            throw new RuntimeException(name + " is not eligible for the vaccine.");
        }
    }

    public void bookDose() {
        try {
            isEligible();
            doseBooking.bookDose();
            System.out.println("Dose booked successfully for " + name);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isDoseBooked() {
        return doseBooking.isDoseBooked();
    }
}
