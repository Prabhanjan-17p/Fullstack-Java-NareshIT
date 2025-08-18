package com.nt;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.model.Student;
import com.nt.service.IStudentService;

@SpringBootApplication
public class Day10Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Day10Application.class, args);
				Scanner sc = new Scanner(System.in);) {
			IStudentService bean = ctx.getBean(IStudentService.class);

			int choice;

			do {
				System.out.println("\n=== Student Management System ===");
				System.out.println("1. Add Student");
				System.out.println("2. Fetch All Students");
				System.out.println("3. Fetch Student By Id");
				System.out.println("4. Fetch Students By Course");
				System.out.println("5. Fetch Students By Marks > Value");
				System.out.println("6. Update Student Marks By Id");
				System.out.println("8. Delete Student By Id");
				System.out.println("0. Exit");
				System.out.print("Enter choice: ");
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					/*
					 * System.out.print("Enter Name: "); String name = sc.nextLine();
					 * System.out.print("Enter Email: "); String email = sc.nextLine();
					 * System.out.print("Enter Course: "); String course = sc.nextLine();
					 * System.out.print("Enter Marks: "); int marks = sc.nextInt(); sc.nextLine();
					 */
					Student student = new Student("Michael Adams", "michael.adams@example.com", "MCA", 95, new Date());
					String std = bean.addNewStudent(student);
					
					System.out.println(std);
					break;

				case 2: 
					List<Student> list = bean.findByAllStudent();
					list.stream().forEach(System.out::println);
					break;

				case 3: 
					System.out.print("Enter Student Id: ");
					String id = sc.nextLine();
					
					Optional<Student> byID = bean.findByID(id);
					
					System.out.println(byID);
					break;

				case 4: 
					System.out.print("Enter Course: ");
					String courseName = sc.nextLine();
					
					List<Student> byCourse = bean.findByCourse(courseName);
					
					byCourse.stream().forEach(System.out::println);

					break;

				case 5: 
					System.out.print("Enter Marks Threshold: ");
					int threshold = sc.nextInt();
					sc.nextLine();
					
					List<Student> byMarksGreaterThan = bean.findByMarksGreaterThan(threshold);
					
					byMarksGreaterThan.stream().forEach(System.out::println);
					
					break;

				case 6: 
					System.out.print("Enter Student Id: ");
					String updateId = sc.nextLine();
					System.out.print("Enter New Marks: ");
					int newMarks = sc.nextInt();
					sc.nextLine();
					
					String updateStudentById = bean.updateStudentById(updateId, newMarks);

					System.out.println(updateStudentById);
					break;

				case 8:
					System.out.print("Enter Student Id: ");
					String deleteId = sc.nextLine();
					
					String deleteStudentById = bean.deleteStudentById(deleteId);

					System.out.println(deleteStudentById);
					break;

				case 0:
					System.out.println("Exiting... Thank you!");
					break;

				default:
					System.out.println("Invalid Choice, Try Again.");
				}
			} while (choice != 0);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
