package com.adithya.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adithya.springdemo.domain.Organization;
import com.adithya.springdemo.domain.promotion.TradeFair;


public class ComponentAnnotation {
	
	public static void main(String args[]){
	//create the application context
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
	
	//create the bean
	TradeFair trade = (TradeFair) ctx.getBean("TradeFair");
	System.out.println(trade.promotionPricing());
	
	

	
	
	((ClassPathXmlApplicationContext) ctx).close();
	
	}
	
	
	
	

}
