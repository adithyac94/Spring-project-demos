package com.adithya.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adithya.springdemo.domain.Organization;


public class InitDestroyApp {
	
	public static void main(String args[]){
	//create the application context
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
	
	//create the bean
	Organization organ = (Organization) ctx.getBean("myorg");
	
	
//	System.out.println(organ.corporateSlogan());
//	
//	System.out.println(organ);
//	
//	System.out.println(organ.corporateService());
	
	
	((ClassPathXmlApplicationContext) ctx).close();
	
	}
	
	
	
	

}
