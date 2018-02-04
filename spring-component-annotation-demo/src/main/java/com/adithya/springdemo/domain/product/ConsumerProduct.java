package com.adithya.springdemo.domain.product;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ConsumerProduct extends GenericProduct {

	@Override
	public int calPrice() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int price = random.nextInt(pricecrandomizer);
		return price;
	}

}
