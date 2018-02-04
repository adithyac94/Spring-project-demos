package com.adithya.springdemo.domain;

public class Address {

	private String city;
	private String street;
	private String ZipCode;
	public Address(String city, String street, String zipCode) {
		super();
		this.city = city;
		this.street = street;
		ZipCode = zipCode;
	}
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", ZipCode=" + ZipCode + "]";
	}
		
}
