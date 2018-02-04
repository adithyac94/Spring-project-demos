package com.adithya.springdemo.domain;

public class Organization {
	
	String CompanyName;
	String yearOfIncorporation;
	private Address address;


	public Organization(String companyName, String yearOfIncorporation, Address address) {
		super();
		CompanyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Organization [CompanyName=" + CompanyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", address=" + address + "]";
	}

}
