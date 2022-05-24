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
		
		student.setFirstName("moon");
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		return "student-confirmation";
	}
}
