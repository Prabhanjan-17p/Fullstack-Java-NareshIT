package com.MovieBookingApplication.user;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.MovieBookingApplication.config.BookingAppConfig;
import com.MovieBookingApplication.exception.InvalidBookingException;
import com.MovieBookingApplication.exception.MovieNotFoundException;
import com.MovieBookingApplication.implementation.MovieBookingApplication;

public class MovieUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Load Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(BookingAppConfig.class);

        // Get the MovieBookingApplication bean
        MovieBookingApplication bookingApp = context.getBean(MovieBookingApplication.class);

        System.out.println("Welcome to the Movie Ticket Booking System ");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Book a Ticket");
            System.out.println("2. Cancel a Ticket");
            System.out.println("3. View Available Shows");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter movie name to book: ");
                        String movieToBook = scanner.nextLine();
                        bookingApp.bookTicket(movieToBook);
                        break;

                    case 2:
                        System.out.print("Enter movie name to cancel: ");
                        String movieToCancel = scanner.nextLine();
                        bookingApp.cancelTicket(movieToCancel);
                        break;

                    case 3:
                        bookingApp.viewShows();
                        break;

                    case 4:
                        System.out.println("Thank you for using the Movie Ticket Booking System. Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (MovieNotFoundException | InvalidBookingException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
