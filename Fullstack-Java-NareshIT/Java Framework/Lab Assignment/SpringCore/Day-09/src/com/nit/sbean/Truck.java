package com.nit.sbean;


public class Truck implements Vehicle{
	
	int payloadCapacity;
	String engineType;

	public Truck(int payloadCapacity, String engineType) {
		super();
		this.payloadCapacity = payloadCapacity;
		this.engineType = engineType;
	}


	@Override
	public String getDescription() {
		return "Trck :: Payload Capacity-"+payloadCapacity+" :: Engine Type-"+engineType;
	}

}