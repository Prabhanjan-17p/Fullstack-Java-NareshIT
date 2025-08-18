package com.nt;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.StudentController;
import com.nt.entity.Student;

@SpringBootApplication
public class Day09Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Day09Application.class, args);
				Scanner sc = new Scanner(System.in)) {

			StudentController controller = ctx.getBean("stdCon", StudentController.class);

			boolean running = true;
			while (running) {
				System.out.println("\n=== University Student Registration System ===");
				System.out.println("1. Add Student");
				System.out.println("2. View All Students");
				System.out.println("3. Update Student");
				System.out.println("4. Delete Student");
				System.out.println("5. Search by Name");
				System.out.println("6. Exit");
				System.out.print("Enter choice: ");

				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Email: ");
					String email = sc.nextLine();
					System.out.print("Enter Course: ");
					String course = sc.nextLine();

					String inserted = controller.insertStudentDetails(name, email, course, LocalDate.now());
					System.out.println(inserted);
					break;

				case 2:
					List<Student> students = controller.fetchAllDetals();
					if (students.isEmpty()) {
						System.out.println("No students found.");
					} else {
						students.forEach(System.out::println);
					}
					break;

				case 3:
					System.out.print("Enter Student ID to Update: ");
					long upId = sc.nextLong();
					sc.nextLine();
					System.out.print("Enter New Name: ");
					String upName = sc.nextLine();
					System.out.print("Enter New Email: ");
					String upEmail = sc.nextLine();
					System.out.print("Enter New Course: ");
					String upCourse = sc.nextLine();

					String updated = controller.updateDetails(upName, upEmail, upCourse, upId);
					System.out.println(updated);
					break;

				case 4:
					System.out.print("Enter Student ID to Delete: ");
					long delId = sc.nextLong();
					String deleted = controller.deleteDetails(delId);
					System.out.println(deleted);
					break;

				case 5:
					System.out.print("Enter name to search: ");
					String searchName = sc.nextLine();
					List<Student> found = controller.searchByName(searchName);
					if (found.isEmpty()) {
						System.out.println("No students found.");
					} else {
						found.forEach(System.out::println);
					}
					break;

				case 6:
					running = false;
					System.out.println("Exiting...");
					break;

				default:
					System.out.println("Invalid choice! Try again.");
					break;
				}
			}
		} catch (Exception e) {
			System.err.println("Error :: " + e.getMessage());
		}
	}
}
