package program;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MultiMedia1 {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB","MYDB");
			PreparedStatement ps = con.prepareStatement("INSERT INTO MULTIMEDIADB VALUES(?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID :");
			String id = sc.nextLine();
			System.out.println("Enter Path :");
			String path = sc.nextLine();
			
			File fl = new File(path);
			if (fl.exists()) {
				FileInputStream in = new FileInputStream(fl);
				ps.setString(1, id);
				ps.setBinaryStream(2, in, fl.length());
				int res = ps.executeUpdate();
				System.out.println(res+" data insert...");
			}else {
				System.out.println("Invalid file and path try again!!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
