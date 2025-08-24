package com.nt.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class Address {
	@Value("${user.address.street}")
	private String street;

	@Value("${user.address.city}")
	private String city;

	@Value("${user.address.state}")
	private String state;

	@Value("${user.address.zipCode}")
	private String zipCode;

}
