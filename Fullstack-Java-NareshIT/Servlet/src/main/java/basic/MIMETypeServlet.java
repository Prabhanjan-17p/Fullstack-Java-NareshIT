package basic;
//Program to display MIME type
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/mime")
public class MIMETypeServlet extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("application/msword");
		PrintWriter pw = response.getWriter();
		pw.print("Welcome...(What ever you write in this pw.print() method all the text will saved inside the mswod file.)");
	}

}
