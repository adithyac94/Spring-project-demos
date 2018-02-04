package com.adithya.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringConstruct {
	
	public static void main(String args[]){
	//create the application context
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
	
	//create the bean
	Organization organ = (Organization) ctx.getBean("myorg");
	organ.corporateSlogan();
	
	System.out.println(organ);
	
	((ClassPathXmlApplicationContext) ctx).close();
	
	}
	
	
	
	

}
