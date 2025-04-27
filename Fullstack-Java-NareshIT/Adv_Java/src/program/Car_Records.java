package program;


import java.sql.*;
import java.util.Scanner;

//qns) Create a java program to connect to the Car database and fetch the details of each car and display with readable o/p.


public class Car_Records {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");
			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery("SELECT * FROM RECORDS");
			
			//User define search data from data base
			/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a brand name to find all details : ");
			String bName = sc.nextLine().toUpperCase();
			ResultSet res = stm.executeQuery("SELECT * FROM RECORDS WHERE BRANDNAME='"+bName+"'");
			*/
			
			while (res.next()) {
				System.out.println(res.getString("BRANDNAME")+"\t"+res.getString("MODEL")+"\t"+res.getInt("YOM")+"\t"+res.getString("TYPEOFCAR"));
			}
			
			res.close();
			stm.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error!!!");
		}
		
	}
}
