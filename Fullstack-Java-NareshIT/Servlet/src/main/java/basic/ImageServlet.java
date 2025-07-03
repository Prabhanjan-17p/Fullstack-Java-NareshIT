package basic;
//Program to display image in browser.
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/image")
public class ImageServlet extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		ServletOutputStream sos = response.getOutputStream(); // Create a byte a Stream from server to browser.
	
		FileInputStream fis = new FileInputStream("D:/Test/testimg.jpg"); // It open for file for reading 
		int n = fis.available(); // It return the file size
		byte [] b = new byte[n]; // Memory allocated in RAM
		fis.read(b); // It will read data from file
		sos.write(b); // It will pass the data to a browser
	}

}
