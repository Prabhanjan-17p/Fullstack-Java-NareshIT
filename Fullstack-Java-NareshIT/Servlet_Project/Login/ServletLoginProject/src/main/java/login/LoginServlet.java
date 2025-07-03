package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con;
	
    public LoginServlet() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
        	ServletContext sc = config.getServletContext();
        	 String driver = sc.getInitParameter("driver");
             String url = sc.getInitParameter("url");
             String uname = sc.getInitParameter("username");
             String pwd = sc.getInitParameter("password");

             Class.forName(driver);
             con = DriverManager.getConnection(url,uname,pwd);
        	
//        	Class.forName("oracle.jdbc.driver.OracleDriver"); 
//          con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "MYDB");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    @Override
    public void destroy() {
       try {
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String s1 = request.getParameter("username");
			String s2 = request.getParameter("password");
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM servletlogindata1 WHERE USERNAME = ? AND PASSWORD =?");
			
			ps.setString(1, s1);
			ps.setString(2, s2);
			
			ResultSet rs = ps.executeQuery();
			
			PrintWriter out = response.getWriter();
			  if (rs.next()) {
				  //Case-1
//				     RequestDispatcher rd1 = request.getRequestDispatcher("welcome.html");
//		             rd1.include(request, response);
				  
				  // Case-2
//		            out.println("<html><body>");
//		            out.println("<h2 style='color:green;'>Login Successful!</h2>");
//		            out.println("<p>Welcome, " + s1 + "!</p>");
//		            out.println("</body></html>");
				  
				  // Case-3
				  Cookie c1 = new Cookie("username",s1);
				  Cookie c2 = new Cookie("password", s2);
				  response.addCookie(c1);
				  response.addCookie(c2);
				  
				  response.sendRedirect("welcome");
		        } else {
//		        	 out.println("<html><body>");             
		        	 out.println("<html><body style='background-color: #24686f;'>");
//		        	 out.println("<h3 style='color:red; margin-left: -40vh;'>Invalid username or password.</h3>");
		        	 RequestDispatcher rd = request.getRequestDispatcher("login.html");
		             rd.include(request, response);
		             out.println("</body></html>");
		        }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
