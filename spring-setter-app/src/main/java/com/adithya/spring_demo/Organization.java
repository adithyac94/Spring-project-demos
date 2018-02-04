package com.adithya.spring_demo;

public class Organization {
	
	private String CompanyName,postalCode;
	private String yearOfIncorporation,employeeCount;
	
	
//	public Organization(){}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	public void setEmployeeCount(String employeeCount) {
		this.employeeCount = employeeCount;
	}



	public Organization(String companyName, String yearOfIncorporation) {
		CompanyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}



	public void corporateSlogan(){
		String Slogan = "We build the ultimate driving maching!!";
		System.out.println(Slogan);
	}



	@Override
	public String toString() {
		return "Organization [CompanyName=" + CompanyName + ", postalCode=" + postalCode + ", yearOfIncorporation="
				+ yearOfIncorporation + ", employeeCount=" + employeeCount + "]";
	}

}
