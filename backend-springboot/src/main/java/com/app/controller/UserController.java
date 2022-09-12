package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserAuthenticationDto;
import com.app.entity.UserEntity;
import com.app.service.IUsersService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins="http://localhost:3000")
public class UserController {

	@Autowired
	private IUsersService userService;
	
	@PostMapping("/signin")
	public String autUser(@RequestBody UserAuthenticationDto loginUser) {
		
		UserEntity user = userService.authenticateUser(loginUser.getUserName(), loginUser.getPassword());
		if(user.getId()==1) {
			System.out.println("Admin Loged in");
			return "1";
		}else {
			System.out.println("User Loged in");
			return "0";
		}
	}
}
