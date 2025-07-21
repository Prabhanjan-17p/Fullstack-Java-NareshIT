package com.nit.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.VehicleService;

public class Main {
    public static void main(String[] args) {
        // Load Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the VehicleService bean
        VehicleService vehicleService = context.getBean(VehicleService.class);

        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle type (Car, Truck, Motorcycle): ");
        String type = scanner.nextLine();

        System.out.print("Enter engine type (Electric, Diesel): ");
        String engineType = scanner.nextLine();

        // Create and describe vehicle
        try {
            String description = vehicleService.createVehicle(type, engineType);
            System.out.println("Vehicle Created: " + description);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
