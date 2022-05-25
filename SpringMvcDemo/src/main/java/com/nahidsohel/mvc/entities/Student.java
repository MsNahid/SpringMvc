package com.nahidsohel.mvc.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private String programmingLanguage;
	
	private String[] operatingSystems;
 
//	private Map<String, String> countryMap;
	
//	public void populateCountryMap(){
//
//		countryMap = new LinkedHashMap<>();
//
//		countryMap.put("BN", "Bangladesh");
//		countryMap.put("IN", "India");
//		countryMap.put("PK", "Pakistan");
//	}
//
}
