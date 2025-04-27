package com.nareshIT.day35;

public class Payment {
	public void makePayment(double amount){
		boolean b = validateAmount(amount);
		
		if (b) {
			System.out.println("Processing payment via Cash...");
			System.out.println("Amount Paid RS :"+amount);
			System.out.println("Payment Successful!");
		}else {
			System.err.println("Enter a valid amount...");
			System.exit(0);
		}
	}
	
	public void makePayment(String cardHolderName, String creditCardNumber,double amount){
		boolean b = validateAmount(amount);
		boolean b1 = validateCardAndDebitNumber(creditCardNumber);

		if (b && b1) {
			System.out.println("Processing payment via Credit Card...");
			System.out.println("Card Holder:"+cardHolderName);
			System.out.println("Card Number: *-*-**-"+maskCardNumber(creditCardNumber));
			System.out.println("Amount Paid RS :"+amount);
			System.out.println("Payment Successful!");
		}else if (b == false){
			System.err.println("Enter a valid amount...");
			System.exit(0);
		}else if (b1 == false ) {
			System.err.println("Enter a valid credit Card Number(16 digits exactly)...");
			System.exit(0);
		}
	}
	
	public void makePayment(String debitCardNumber, double amount){
		boolean b = validateAmount(amount);
		boolean b1 = validateCardAndDebitNumber(debitCardNumber);

		if (b && b1) {
			System.out.println("Processing payment via Debit Card...");
			System.out.println("Card Number: *-*-**-"+maskCardNumber(debitCardNumber));
			System.out.println("Amount Paid RS :"+amount);
			System.out.println("Payment Successful!");
		}else if (b == false){
			System.err.println("Enter a valid amount...");
			System.exit(0);
		}else if (b1 == false ) {
			System.err.println("Enter a valid Debit Card Number(16 digits exactly)...");
			System.exit(0);
		}
	}
	
	private boolean validateAmount(double vl){
		if (vl > 0) {
			return true;
		}
		return false;
	}
	private boolean validateCardAndDebitNumber(String vl){
		if (vl.length() == 16) {
			return true;
		}
		return false;
	}
	
	private String  maskCardNumber(String cn){
		return ""+cn.charAt(12)+cn.charAt(13)+cn.charAt(14)+cn.charAt(15);
	}
}
