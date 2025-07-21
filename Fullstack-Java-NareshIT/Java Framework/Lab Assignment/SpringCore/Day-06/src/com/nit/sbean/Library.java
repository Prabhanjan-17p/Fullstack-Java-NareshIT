package com.nit.sbean;


import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Library {

    public void grantAccess(String studentType, String clearBookDueDate) {
        if (isRegistered(studentType) && bookDueDate(clearBookDueDate)) {
            System.out.println("Access granted to library.");
        } else {
            System.out.println("Access denied. Please register first or clear book dues.");
        }
    }

    public boolean isRegistered(String studentType) {
        return "registered".equalsIgnoreCase(studentType);
    }

    public boolean bookDueDate(String date) {
        return LocalDate.now().toString().equals(date);
    }
}