package com.nareshIT.day28;

public class Hosteller extends Student {
	double hostelFee ;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	public String displayDetails() {
		return "Hosteller [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", hostelFee="
				+ hostelFee + "]";
	}
	
	public void payAmount(double amt) {
		double examFee = payFee();
		double totFee = examFee+hostelFee;
		if (totFee == amt) {
			System.out.println("All payment clear...");
		}else {
			if (totFee < amt) {
				System.out.println("You pay more than the university fee, yet you receive less."+(amt-totFee));
			}else {
				System.out.println("Your remaining payment is "+(totFee - amt));
			}
		}
	}
	
	
}
