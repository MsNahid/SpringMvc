package com.nahidsohel.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public String getHome(){
		return "home";
	}

//	@GetMapping("/sohel")
//	public String getSohel(){
//		return "moon";
//	}
}
