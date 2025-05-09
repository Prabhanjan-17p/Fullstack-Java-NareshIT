package program;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class Emp_Calleble {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");
            
            System.out.print("Enter Choice:\n1.Insert Records \n2.Search the data according to ID \nEnter Here : ");
            int ch = Integer.parseInt(sc.nextLine());
            
            switch (ch) {
			case 1: {
	            CallableStatement in = con.prepareCall("{CALL EMPDBPRO42IN(?,?,?,?)}");
	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter ID: ");
	            String id = sc.nextLine();
	            System.out.print("Enter Age: ");
	            int age = Integer.parseInt(sc.nextLine());
	            System.out.print("Enter Name: ");
	            String gen = sc.nextLine();
	            in.setString(1, name);
	            in.setString(2, id);
	            in.setInt(3, age);
	            in.setString(4, gen);
	            
	            in.executeUpdate();
	            
	            System.out.println("Data inserted successfully...");
				break;
			}
			case 2: {
	            System.out.print("Enter EMP ID:");
	            String ids = sc.nextLine();
	            
	            //first placeHolder is for ID (Search Condition)
	            CallableStatement cs = con.prepareCall("{call EMPDBPRO42OUT(?,?,?,?)}");
	            
	            cs.setString(1, ids); 
	            cs.registerOutParameter(2, Types.VARCHAR);   
	            cs.registerOutParameter(3, Types.INTEGER);   
	            cs.registerOutParameter(4, Types.VARCHAR); 
	            
	            boolean bb =  cs.execute();
	            
	            if (!bb) {
		            System.out.println("Name   : " + cs.getString(2));
		            System.out.println("Age    : " + cs.getInt(3));
		            System.out.println("Gender : " + cs.getString(4));
				}else {
					System.err.println("Plz enter valid ID!!!");
				}

				break;
			}
			default:
				System.err.println("Enter a valid choice!!!");
			}
            
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
