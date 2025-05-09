package com.nareshIT.day68;

public class VaccineEligibility {
    private int age;
    private boolean hasHealthCondition;

    public VaccineEligibility(int age, boolean hasHealthCondition) {
        this.age = age;
        this.hasHealthCondition = hasHealthCondition;
    }

    public void isEligible() throws Eligible {
        if (age >= 18 && (age < 60 || hasHealthCondition)) {
            // Eligible
        } else {
            throw new Eligible("You are not eligible for the vaccine.");
        }
    }
}
