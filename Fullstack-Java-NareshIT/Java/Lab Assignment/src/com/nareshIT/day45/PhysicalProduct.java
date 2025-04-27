package com.nareshIT.day45;

public class PhysicalProduct extends Product {
	private double shippingWeight;
	
	public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}

	double Disamt=getPrice();
	@Override
	public void applyDiscount(double percentage) {
		Disamt = Disamt*(percentage/100);
	}

	@Override
	public double calculateTax() {
		return (getPrice()-Disamt)*0.08;
	}
	
	public double calculateShippingCost() {
		//1kg = 5rs
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Physical Product: \nProduct Name: " + getName() + "\nCategory: " + getCategory() + "\nPrice RS: "+getPrice()+"\nShipping Weight: "+this.shippingWeight+"\nDiscount applied : "+Disamt+"\nNew Price : "+(getPrice()-Disamt)+"\nTax RS : "+calculateTax()+"\nShipping Cost RS : "+(shippingWeight*5);
	}

}
