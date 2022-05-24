package com.nahidsohel.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	
	@RequestMapping("/showForm")
	public String getHelloWorldForm(){
		return "helloWorld-form";
	}
	
	@RequestMapping("/processForm")
	public String showHelloWorld(){
		
		return "helloworld";
		
	}
	
	


}
