package com.adithya.springdemo.domain;

import com.adithya.springService.BusinessService;

public class Organization {
	
	private String CompanyName,postalCode;
	private String yearOfIncorporation,employeeCount;
	private String slogan;
	private BusinessService service;
	
	
//	public Organization(){}
	
	public void setSlogan(String slogans) {
		slogan = slogans;
	}

	public void postConstruct(){
		
		System.out.println("Organization: calling postconstruct...........");
		
	}
	
	public void preDestruct(){
		
		System.out.println("Organization: calling predestruct...........");
		
	}
	
	
//	public void initialize(){
//		System.out.println("Initializing");
//	}

//	public void destroy(){
//		System.out.println("Destroying");
//	}

	public void setService(BusinessService service) {
		this.service = service;
	}



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



	public String corporateSlogan(){
		return slogan;
	}

public String corporateService(){
	return service.offerService(CompanyName);
}

	@Override
	public String toString() {
		return "Organization [CompanyName=" + CompanyName + ", postalCode=" + postalCode + ", yearOfIncorporation="
				+ yearOfIncorporation + ", employeeCount=" + employeeCount + "]";
	}

}
