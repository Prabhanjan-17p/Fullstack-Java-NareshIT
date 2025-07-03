//package login;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class RegServlet
// */
//@WebServlet("/reg")
//public class RegServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	Connection con = null;
//	PreparedStatement ps = null;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public RegServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see Servlet#init(ServletConfig)
//	 */
//	public void init(ServletConfig config) throws ServletException {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "MYDB");	
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//
//	/**
//	 * @see Servlet#destroy()
//	 */
//	public void destroy() {
//		// TODO Auto-generated method stub
//		try {
//			con.close();
//			ps.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//		String s1 = request.getParameter("fname");
//		String s2 = request.getParameter("lname");
//		String s3 = request.getParameter("username");
//		String s4 = request.getParameter("password");
//		
//			ps = con.prepareStatement("insert into servletlogindata1 values(?,?,?,?)");
//			//Table- create table servletlogindata1(fname varchar2(30),lname varchar2(30),username varchar2(50),password varchar2(30));
//		ps.setString(1, s1);
//		ps.setString(2, s2);
//		ps.setString(3, s3);
//		ps.setString(4, s4);
//		
//		int a = ps.executeUpdate();
//		PrintWriter out = response.getWriter();
//		if (a > 0) {
//	        out.println("<!DOCTYPE html>");
//	        out.println("<html>");
//	        out.println("<head>");
//	        out.println("<title>Registration Success</title>");
//	        out.println("<style>");
//	        out.println("body { font-family: Arial, sans-serif; text-align: center; padding-top: 50px; }");
//	        out.println("a { text-decoration: none; color: white; background-color: #4CAF50; padding: 10px 20px; border-radius: 5px; }");
//	        out.println("</style>");
//	        out.println("</head>");
//	        out.println("<body>");
//	        out.println("<h2>You have registered successfully!</h2>");
//	        out.println("<a href='login.html'>Login</a>");
//	        out.println("</body>");
//	        out.println("</html>");
//		}else {
//            out.println("<h2>Registration failed. Please try again.</h2>");
//		}
//		     
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//}



package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Connection con = null;

    public void init(ServletConfig config) throws ServletException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // ✅ Load Oracle JDBC Driver
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "MYDB");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        try {
            if (con != null) con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");

        String s1 = request.getParameter("fname");
        String s2 = request.getParameter("lname");
        String s3 = request.getParameter("uname");
        String s4 = request.getParameter("pwd");

        try (
            PreparedStatement ps = con.prepareStatement("INSERT INTO servletlogindata1 VALUES (?, ?, ?, ?)");
            PrintWriter out = response.getWriter();
        ) {
            ps.setString(1, s1);
            ps.setString(2, s2);
            ps.setString(3, s3);
            ps.setString(4, s4);

            int rows = ps.executeUpdate();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registration Success</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; text-align: center; padding-top: 50px; background-color: #f4f4f4; }");
            out.println("h2 { color: green; }");
            out.println("a { text-decoration: none; color: white; background-color: #4CAF50; padding: 10px 20px; border-radius: 5px; }");
            out.println("a:hover { background-color: #45a049; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            if (rows > 0) {
                out.println("<h2>You have registered successfully!</h2>");
                out.println("<a href='login.html'>Login</a>");
            } else {
                out.println("<h2>Registration failed. Please try again.</h2>");
            }
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
