package com.adithya.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {
	
	public List<String> getName(String name){
		
		List<String> Name = new ArrayList();
		
		Name.add("Hello! ");
		Name.add(name);
		Name.add(", ");
		Name.add("Welcome to my World!");
		
		return Name;
		
	}

}
