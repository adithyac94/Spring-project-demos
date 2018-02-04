package com.adithya.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericWelcomeService{
	
	public List<String> welcomeMessage(String name){
		
		List<String> Name = new ArrayList();
		
		Name.add("Hello! ");
		Name.add(name);
		Name.add(", ");
		Name.add("Welcome to my World!");
		
		return Name;
		
	}

//	@Override
//	public List<String> welcomeMessage(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
