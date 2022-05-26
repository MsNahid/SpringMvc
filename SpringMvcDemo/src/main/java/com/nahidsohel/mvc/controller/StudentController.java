package com.nahidsohel.mvc.controller;


import com.nahidsohel.mvc.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showFrom")
	public String getStudentForm(Model model){
		
		Student student = new Student();
		
//		student.setFirstName("moon");
//		student.populateCountryMap();
//		Map<String, String> countryMap = student.getCountryMap();
//
//		System.out.println(Arrays.asList(countryMap));
		
		
		model.addAttribute("student", student);
//		model.addAttribute("countryOptions", countryMap);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		
		return "student-confirmation";
	}
}
