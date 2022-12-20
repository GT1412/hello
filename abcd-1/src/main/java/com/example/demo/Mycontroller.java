package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

	
	@RequestMapping("/hello")
	public String Guavrao ()
	{
		return "Gaurav Talidhikar";
	}
}