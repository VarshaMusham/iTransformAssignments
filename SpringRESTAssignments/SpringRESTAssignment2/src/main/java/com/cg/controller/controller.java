package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.User;
import com.cg.service.UserService;

@RestController
@RequestMapping("/A2")
class controller {
	
	@Autowired
	UserService us;
	
	@GetMapping("/login/{username}/{password}")
	public String login(@PathVariable("username") String username,@PathVariable("password") String password) {
		return us.login(username,password);
	}
	
	@GetMapping("/all")
	public List<User> all() {
		return us.allUsers();
	}

}
