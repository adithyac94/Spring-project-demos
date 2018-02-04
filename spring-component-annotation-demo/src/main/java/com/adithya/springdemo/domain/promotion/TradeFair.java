package com.adithya.springdemo.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adithya.springdemo.domain.product.ConsumerProduct;
import com.adithya.springdemo.domain.product.IndustrialClass;

@Component("TradeFair")
public class TradeFair {
	
	private ConsumerProduct consumerproduct;
	private IndustrialClass industrialproduct;

	public TradeFair(){}
	
	@Autowired
public TradeFair(ConsumerProduct consumerproduct, IndustrialClass industrialproduct) {
		this.consumerproduct = consumerproduct;
		this.industrialproduct = industrialproduct;
	}

//	@Autowired
//	public void setConsumerproduct(ConsumerProduct consumerproduct) {
//		this.consumerproduct = consumerproduct;
//	}
//
//	@Autowired
//	public void setIndustrialproduct(IndustrialClass industrialproduct) {
//		this.industrialproduct = industrialproduct;
//	}

	public int declareIndustralProductPrice(IndustrialClass industrialproduct){
		return industrialproduct.calPrice();
	}
	
	public int declareConsumerProductPrice(ConsumerProduct consumerproduct){
		return consumerproduct.calPrice();
	}

	public String promotionPricing(){
		String price = "Industrial products are priced at $"+declareIndustralProductPrice(industrialproduct)+
				" and consumer products at $"+declareConsumerProductPrice(consumerproduct); 
		return price;
	}
}
