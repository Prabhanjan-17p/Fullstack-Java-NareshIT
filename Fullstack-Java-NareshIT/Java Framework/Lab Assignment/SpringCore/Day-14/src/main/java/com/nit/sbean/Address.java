package com.nit.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("add")
public class Address {
	@Value("${user.address.state}")
	String street;
	
	@Value("${user.address.city}")
	String city;
	
	@Value("${user.address.street}")
	String state;
	
	@Value("${user.address.zipCode}")
	String zipCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
}
