package com.adithya.spring_demo;

public class Organization {
	
	String CompanyName;
	String yearOfIncorporation;
	
	
//	public Organization(){}
	
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
		return "Organization [CompanyName=" + CompanyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}

}
