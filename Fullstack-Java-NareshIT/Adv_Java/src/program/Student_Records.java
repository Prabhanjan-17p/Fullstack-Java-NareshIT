package program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student_Records {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "MYDB");
			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery("SELECT * FROM STDDB");
			while(res.next()) {
				System.out.println(res.getInt("ROLLNO")+"\t"+res.getString("NAME")+"\t"+res.getString("DEPT")+"\t"+res.getInt("YEAR")+"\t"+res.getDouble("PERCENTAGE"));
			}
		} catch (Exception e) {
			System.out.println("Error-----------");
		}

	}

}
