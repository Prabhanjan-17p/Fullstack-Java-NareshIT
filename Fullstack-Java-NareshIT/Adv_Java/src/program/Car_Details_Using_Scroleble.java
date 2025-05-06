package program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Car_Details_Using_Scroleble {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");
            Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet res = stm.executeQuery("SELECT * FROM RECORDS");

            // 1 - Print last row
            if (res.last()) {
                System.out.println(res.getString("BRANDNAME") + "\t" + res.getString("MODEL") + "\t" + res.getInt("YOM") + "\t" + res.getString("TYPEOFCAR"));
            } else {
                System.out.println("No data found!!!");
            }

            // 2 - Print Brand name starting with "T"
            res.beforeFirst(); 
            System.out.println("\nBrand name starting with 'T':");
            while (res.next()) {
                String bname = res.getString("BRANDNAME");
                if (bname.startsWith("T")) {
                    System.out.println(bname + "\t" + res.getString("MODEL") + "\t" + res.getInt("YOM") + "\t" + res.getString("TYPEOFCAR"));
                }
            }

            // 3 - Skip every second row and print details
            res.beforeFirst(); 
            System.out.println("\nSkipping every second row:");
            int c = 1;
            while (res.next()) {
                if (c % 2 == 0) {
                    System.out.println(res.getString("BRANDNAME") + "\t" + res.getString("MODEL") + "\t" + res.getInt("YOM") + "\t" + res.getString("TYPEOFCAR"));
                }
                c++;
            }

            // Closing resources (good practice)
            res.close();
            stm.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
