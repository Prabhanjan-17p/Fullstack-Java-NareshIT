package com.nit.sbean;

public class Car implements Vehicle{
	
	int noOfDoor;
	String engineType;

	public Car(int noOfDoor, String engineType) {
		super();
		this.noOfDoor = noOfDoor;
		this.engineType = engineType;
	}

	@Override
	public String getDescription() {
		return "Car :: Number of Doors-"+noOfDoor+" :: Engine Type-"+engineType;
	}

}
