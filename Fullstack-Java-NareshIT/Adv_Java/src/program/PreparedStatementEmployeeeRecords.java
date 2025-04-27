package program;

import java.sql.*;

class Emp{
	String name;
	String id;
	int salary;
	
	public Emp(String name, String id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void add_Emp() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
			PreparedStatement ps = con.prepareStatement("INSERT INTO EMPDB VALUES(?,?,?)");
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			int row = ps.executeUpdate();
			if (row > 0) {
				System.out.println("data insert succesfully!!!");
			}else {
				System.err.println("data not insert!!!");
			}
			ps.close();
			con.close();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}

public class PreparedStatementEmployeeeRecords {

	public static void main(String[] args) {
		Emp e1 = new Emp("TYP01", "Kanha", 60000);
		Emp e2 = new Emp("TYP02", "Tarun", 60000);
		Emp e3 = new Emp("TYP03", "Dora", 90000);
		e1.add_Emp();
		e2.add_Emp();
		e3.add_Emp();
	}

}
