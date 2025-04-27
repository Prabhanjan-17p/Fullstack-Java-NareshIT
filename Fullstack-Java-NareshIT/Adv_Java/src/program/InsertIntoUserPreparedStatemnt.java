package program;

import java.sql.*;
import java.util.Scanner;

public class InsertIntoUserPreparedStatemnt {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");

            String insertQuery = "INSERT INTO LAPTOPREC VALUES (?, ?, ?, ?, ?)";
            String deleteQuery = "DELETE FROM LAPTOPREC WHERE MODEL = ?";
            String selectQuery = "SELECT * FROM LAPTOPREC";

            boolean check = true;

            while (check) {
                System.out.println("Choose an option:");
                System.out.println("1 - Insert");
                System.out.println("2 - Display");
                System.out.println("3 - Delete");
                System.out.println("4 - Exit");
                System.out.print("Enter your choice: ");
                int ch = Integer.parseInt(sc.nextLine());

                switch (ch) {
                    case 1:
                        PreparedStatement psInsert = con.prepareStatement(insertQuery);
                        System.out.print("How many laptop entries do you want to insert? ");
                        int size = Integer.parseInt(sc.nextLine());

                        for (int i = 1; i <= size; i++) {
                            System.out.println("Enter details for laptop " + i + ":");
                            System.out.print("Brand Name: ");
                            String brand = sc.nextLine();
                            System.out.print("Model: ");
                            String model = sc.nextLine();
                            System.out.print("Processor: ");
                            String processor = sc.nextLine();
                            System.out.print("RAM Size (in GB): ");
                            int ramSize = Integer.parseInt(sc.nextLine());
                            System.out.print("Price: ");
                            int price = Integer.parseInt(sc.nextLine());

                            psInsert.setString(1, brand);
                            psInsert.setString(2, model);
                            psInsert.setString(3, processor);
                            psInsert.setInt(4, ramSize);
                            psInsert.setInt(5, price);

                            psInsert.executeUpdate();
                            System.out.println("Laptop " + i + " inserted successfully.\n");
                        }
                        psInsert.close();
                        break;

                    case 2:
                        PreparedStatement psDisplay = con.prepareStatement(selectQuery);
                        ResultSet rs = psDisplay.executeQuery();

                        System.out.println("\n--- Laptop Records ---");
                        while (rs.next()) {
                            System.out.println("Brand: " + rs.getString("BRANDNAME") +
                                    ", Model: " + rs.getString("MODEL") +
                                    ", Processor: " + rs.getString("PROCESSOR") +
                                    ", RAM: " + rs.getInt("RAMSIZE") + "GB" +
                                    ", Price: " + rs.getInt("PRICE"));
                        }
                        rs.close();
                        psDisplay.close();
                        break;

                    case 3:
                        PreparedStatement psDelete = con.prepareStatement(deleteQuery);
                        System.out.print("Enter the model name of the laptop to delete: ");
                        String modelToDelete = sc.nextLine();

                        psDelete.setString(1, modelToDelete);
                        int rowsDeleted = psDelete.executeUpdate();

                        if (rowsDeleted > 0) {
                            System.out.println("Laptop with model " + modelToDelete + " deleted successfully.");
                        } else {
                            System.out.println("No laptop found with model " + modelToDelete + ".");
                        }
                        psDelete.close();
                        break;

                    case 4:
                        check = false;
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Enter a valid choice.");
                        break;
                }
            }

            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
