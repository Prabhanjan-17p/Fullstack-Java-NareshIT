package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nit.sbean.Student;

public class FeeSubmission {

    public static void main(String[] args) {
    	try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");){
    	    // Retrieve and process student beans
            for (int i = 1; i <= 3; i++) {
                Student student = ctx.getBean("student" + i, Student.class);
                double balance = student.payFee();

                // Decision logic
                if (balance > 0) {
                    System.out.println("have to pay more amount of Rs.");
                    System.out.println("Rs. " + balance);
                } else if (balance < 0) {
                    System.out.println("refund of Rs.");
                    System.out.println("Rs. " + Math.abs(balance));
                } else {
                    System.out.println("All due clear !!");
                }

                // Display student details
                student.displayDetails();
                System.out.println("--------------------------------");
            }

		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

