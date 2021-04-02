package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Address;
import com.cg.service.AdService;


@RestController
@RequestMapping("/A3")
public class Controller {
	
	@Autowired
	AdService s;
	
	@GetMapping("/all")
	public List<Address> all() {
		return s.getall();
	}
	
	@GetMapping("/oneaddress/{zipcode}")
	public Address login(@PathVariable("zipcode") int zipcode) {
		return s.getone(zipcode);
	}


}
