package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/sample") // if we remove this annotation (@WebServlet) then you most have have to write xml if both are there means it gives you error(only one have used a time(xml or annotation))
public class SampleServlet extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.print("WelCome");
	}

}
