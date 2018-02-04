package com.adithya.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adithya.springdemo.domain.Organization;


public class BeanScopeApp {
	
	public static void main(String args[]){
	//create the application context
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
	
	//create the bean
	Organization organ = (Organization) ctx.getBean("myorg");
	Organization organ2 = (Organization) ctx.getBean("myorg");
	
	organ2.setPostalCode("007");
	
	
	//System.out.println(organ.corporateSlogan());
	
	System.out.println(organ);
	System.out.println(organ2);
	
	//System.out.println(organ.corporateService());
	
	if(organ == organ2){
		System.out.println("The singleton scope worked: organ and organ2 are pointing to the same instance");
	}
	
	((ClassPathXmlApplicationContext) ctx).close();
	
	}
	
	
	
	

}
