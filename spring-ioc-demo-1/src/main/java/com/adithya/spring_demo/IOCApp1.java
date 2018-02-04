package com.adithya.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {
	
	public static void main(String args[]){
	//create the application context
	
	ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
	
	Organization organ = (Organization) ctx.getBean("myorg");
	organ.corporateSlogan();
	
	((FileSystemXmlApplicationContext) ctx).close();
	
	}
	
	
	
	

}
