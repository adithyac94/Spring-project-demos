package com.adithya.springdemo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adithya.springdemo.service.RandomizerRequestScope;
import com.adithya.springdemo.service.RandomizerSessionScope;

@Controller
public class ScopeController {
	
	@Autowired
	RandomizerRequestScope randomizer1;
	
	@Autowired
	RandomizerSessionScope randomizer2;
	
	@RequestMapping("/")
	public void getRandom(HttpServletResponse response) throws Exception{
		response.getWriter().write("******** request scope ********<br>");
		response.getWriter().write("Old number "+randomizer1.getRandomNumber()+"<br>");
		randomizer1.generateRandomNumber();
		response.getWriter().write("New number "+randomizer1.getRandomNumber()+"<br>");
		response.getWriter().write("Object reference "+randomizer1+"<br>");
		
		response.getWriter().write("******** session scope ********<br>");
		response.getWriter().write("Old number "+randomizer2.getRandomNumber()+"<br>");
		randomizer2.generateRandomNumber();
		response.getWriter().write("New number "+randomizer2.getRandomNumber()+"<br>");
		response.getWriter().write("Object reference "+randomizer2+"<br>");
	}

}
