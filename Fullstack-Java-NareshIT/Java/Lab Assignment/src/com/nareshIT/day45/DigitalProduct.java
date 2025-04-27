package com.nareshIT.day45;

public class DigitalProduct extends Product {
	private String licenseKey ;
	
	public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	}

	double Disamt=getPrice();
	@Override
	public void applyDiscount(double percentage) {
		Disamt = Disamt*(percentage/100);
	}

	@Override
	public double calculateTax() {
		return (getPrice()-Disamt)*0.05;
	}

	@Override
	public String toString() {
		return "Digital Product : \nProduct Name: " + getName() + "\nCategory: " + getCategory() + "\nPrice RS: "+getPrice()+"\nLicense Key: "+this.licenseKey+"\nDiscount applied : "+Disamt+"\nNew Price : "+(getPrice()-Disamt)+"\nTax RS : "+calculateTax();
	}

}
