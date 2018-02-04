package com.adithya.springdemo.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adithya.service.demo.GenericWelcomeService;
import com.adithya.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeservice;
	
	@RequestMapping("/")
	public String doWelcome(Model model){
		
	System.out.println("Calling doWelcome");
		
		//WelcomeService service = new WelcomeService();
		List<String> myMess = welcomeservice.welcomeMessage("Terry");
		
		model.addAttribute("mymessage",myMess);
		
		return "welcomeNew";
		
	}

}
