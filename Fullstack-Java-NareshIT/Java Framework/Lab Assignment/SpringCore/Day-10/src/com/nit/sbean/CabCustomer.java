package com.nit.sbean;

public class CabCustomer {
	private int customerId;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private double distance;
	private String phoneNumber;

	// Default Constructor
	public CabCustomer() {
		System.out.println("CabCustomer :: 0 Parameter Constructor.");
	}

	// Parameterized Constructor
	public CabCustomer(int customerId, String customerName, String pickupLocation, String dropLocation, double distance,
			String phoneNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phoneNumber = phoneNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CabCustomer [customerId=" + customerId + ", customerName=" + customerName + ", pickupLocation="
				+ pickupLocation + ", dropLocation=" + dropLocation + ", distance=" + distance + ", phoneNumber="
				+ phoneNumber + "]";
	}

}
