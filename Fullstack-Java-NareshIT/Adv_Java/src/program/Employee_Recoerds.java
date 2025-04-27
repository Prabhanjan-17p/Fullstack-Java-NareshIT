package program;

import java.sql.*;
import java.util.Scanner;
public class Employee_Recoerds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fetch = "SELECT * FROM EMPRECORDS WHERE SALARY > 5000";
		String insert = "INSERT INTO EMPRECORDS VALUES(?,?,?,?,?,?)";
		String findAll =  "SELECT * FROM EMPRECORDS";
		String createTable = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");
			PreparedStatement ps = null;
			Statement stmt = con.createStatement();
			boolean check = true;
			while (check) {
				System.out.println("Choose an option:");
	            System.out.println("1 - Fetch details those salary grater than 5000");
	            System.out.println("2 - Display all details");
	            System.out.println("3 - Insert 3 new row");
	            System.out.println("4 - Create a new table");
	            System.out.println("5 - Exit");
	            System.out.print("Enter your choice: ");
	            int ch = Integer.parseInt(sc.nextLine());
	            
	            switch (ch) {
				case 1:
					ps = con.prepareStatement(fetch);
					ResultSet res = ps.executeQuery();
					System.out.println("EMPID \tEMPNAME \tDESIGNATION \tSALARY");
					System.out.println("--------------------------------------------");
					while(res.next()) {
						System.out.println(res.getString(1)+"\t"+res.getString(2)+"\t\t"+res.getString(3)+"\t\t"+res.getInt(4));
					}
//					res.close();
					break;
				case 2:
					ps = con.prepareStatement(findAll);
					ResultSet res1 = ps.executeQuery();
					while(res1.next()) {
						System.out.println(res1.getString(1)+"\t"+res1.getString(2)+"\t"+res1.getString(3)+"\t"+res1.getInt(4));
					}
//					res1.close();
					break;
				case 3:
						ps = con.prepareStatement(insert);
					
					   System.out.print("How many Employee details do you want to insert? ");
                       int size = Integer.parseInt(sc.nextLine());

                       for (int i = 1; i <= size; i++) {
                           System.out.print("EMPID: ");
                           String empID = sc.nextLine();
                           System.out.print("EMPNAME: ");
                           String empName = sc.nextLine();
                           System.out.print("DESIGNATION: ");
                           String Des = sc.nextLine();
                           System.out.print("SALARY: ");
                           int sal = Integer.parseInt(sc.nextLine());

                           ps.setString(1, empID);
                           ps.setString(2, empName);
                           ps.setString(3, Des);
                           ps.setInt(4, sal);

                           int row = ps.executeUpdate();
                           if (row > 0) {
							System.out.println(i+" Row insert succesfully!!!");
                           }else {
                        	   System.out.println("Row not insert yet!!!");
                           }
                       }
					break;
				case 4:
					System.out.print("Enter your table name: ");
					String tbName = sc.nextLine();
					createTable = "CREATE TABLE " + tbName + " (" +"ID NUMBER PRIMARY KEY, " +"NAME VARCHAR2(100), " +"AGE NUMBER" +")";
					stmt.executeUpdate(createTable);
                    System.out.println("Table '" + tbName + "' created successfully!");
					
					break;
				case 5:
					System.out.println("Thank You Visit Agin!!!");
					check = false;
					break;
				default:
					System.out.println("Enter a valid choice!!!");
				}
	            
			}
			ps.close();
			con.close();
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
