package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.ProductController;
import com.nt.model.Product;

@SpringBootApplication
public class Day04Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Day04Application.class, args);
				Scanner sc = new Scanner(System.in)) {

			ProductController controller = ctx.getBean(ProductController.class);
			boolean bol = true;

			while (bol) {
				System.out.println("\n==========================");
				System.out.println("Product Inventory System");
				System.out.println("1. Add product");
				System.out.println("2. View all products");
				System.out.println("3. Show total inventory value");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");

				int key = sc.nextInt();

				switch (key) {
				case 1:
					System.out.print("Enter Product ID: ");
					Long id = sc.nextLong();
					sc.nextLine(); 

					System.out.print("Enter Product Name: ");
					String name = sc.nextLine();

					System.out.print("Enter Quantity: ");
					int quantity = sc.nextInt();

					System.out.print("Enter Price per Unit: ");
					double price = sc.nextDouble();

					Product product = new Product(id, name, quantity, price);
					String addMsg = controller.addProduct(product);
					System.out.println(addMsg);
					break;

				case 2:
					List<Product> products = controller.getAllProducts();
					if (products.isEmpty()) {
						System.out.println("❗ No products available.");
					} else {
						System.out.println("\nProduct List:");
						for (Product p : products) {
							System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Qty: "
									+ p.getQuantity() + ", Price: ₹" + p.getPrice());
						}
					}
					break;

				case 3:
					String totalValueMsg = controller.getTotalInventoryValue();
					System.out.println(totalValueMsg);
					break;

				case 4:
					System.out.println("Exiting... Thank you!");
					bol = false;
					break;

				default:
					System.out.println("Invalid choice. Please try again.");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
