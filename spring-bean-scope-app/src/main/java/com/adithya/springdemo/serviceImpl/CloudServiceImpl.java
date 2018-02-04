package com.adithya.springdemo.serviceImpl;

import java.util.Random;

import com.adithya.springService.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		String service = "The Cloud service organization is "+companyName+" and the annual "
				+ "revenue exceeds "+random.nextInt(revenue)+" dollars";
		
		return service;
	}

}
