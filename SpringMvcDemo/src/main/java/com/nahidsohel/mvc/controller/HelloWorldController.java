package com.nahidsohel.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping("/processFormVersionTwo")
	public String showHelloWorldVersionTwo(HttpServletRequest httpServletRequest, Model model){
		
		String theName = httpServletRequest.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Hi, " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	
	
	
	}
	
	
	
	


}
