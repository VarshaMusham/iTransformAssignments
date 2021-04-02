package com.cg.SpringRESTAssignment1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/A1")
public class A1Controller {
	
	@GetMapping("/hi")
	public String hello() {
		return "Hello World";
	}

}
