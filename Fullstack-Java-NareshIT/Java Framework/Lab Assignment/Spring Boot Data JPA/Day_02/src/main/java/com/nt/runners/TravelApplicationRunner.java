package com.nt.runners;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Travel;
import com.nt.service.TravelServiceIMPL;

@Component
public class TravelApplicationRunner implements CommandLineRunner {

	@Autowired
	private TravelServiceIMPL serviceIMPL;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("\n========= Travel Booking Menu =========");
			System.out.println("1. Add a new travel booking");
			System.out.println("2. Retrieve all travel bookings");
			System.out.println("3. Find a travel booking by ID");
			System.out.println("4. Delete a travel booking by ID");
			System.out.println("5. Check if a travel booking exists");
			System.out.println("6. Count total travel bookings");
			System.out.println("7. Delete a specific travel booking");
			System.out.println("8. Delete all travel bookings");
			System.out.println("9. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Travel ID: ");
				Long id = sc.nextLong();
				sc.nextLine();
				System.out.print("Enter Destination: ");
				String destination = sc.nextLine();
				System.out.print("Enter Traveler Name: ");
				String traveler = sc.nextLine();
				System.out.print("Enter Price: ");
				Double price = sc.nextDouble();

				Travel travel = new Travel(id, destination, traveler, price);
				serviceIMPL.addTravel(travel);
				System.out.println("✅ Travel booking added successfully!");
				break;

			case 2:
				System.out.println("📋 All Travel Bookings:");
				serviceIMPL.getAllTravels().forEach(System.out::println);
				break;

			case 3:
				System.out.print("Enter Travel ID to find: ");
				Long findId = sc.nextLong();
				serviceIMPL.findTravelById(findId).ifPresentOrElse(t -> System.out.println("Found: " + t),
						() -> System.out.println("❌ Travel not found!"));
				break;

			case 4:
				System.out.print("Enter Travel ID to delete: ");
				Long delId = sc.nextLong();
				serviceIMPL.deleteTravelById(delId);
				System.out.println("🗑️ Travel booking deleted (if existed).");
				break;

			case 5:
				System.out.print("Enter Travel ID to check: ");
				Long chkId = sc.nextLong();
				System.out.println(serviceIMPL.existsById(chkId) ? "✅ Travel booking exists."
						: "❌ Travel booking does not exist.");
				break;

			case 6:
				System.out.println("📊 Total travel bookings: " + serviceIMPL.count());
				break;

			case 7:
				System.out.print("Enter Travel ID to delete specific booking: ");
				Long delObjId = sc.nextLong();
				serviceIMPL.findTravelById(delObjId).ifPresentOrElse(t -> {
					serviceIMPL.delete(t);
					System.out.println("🗑️ Travel booking deleted successfully!");
				}, () -> System.out.println("❌ Travel not found!"));
				break;

			case 8:
				serviceIMPL.deleteAll();
				System.out.println("🗑️ All travel bookings deleted.");
				break;

			case 9:
				System.out.println("👋 Exiting... Thank you!");
				exit = true;
				break;

			default:
				System.out.println("⚠️ Invalid choice! Try again.");
			}
		}

		sc.close();
	}
}
