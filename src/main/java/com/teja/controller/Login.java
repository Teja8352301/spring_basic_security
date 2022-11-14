package com.teja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
	
	@GetMapping("showMyLoginPage")
	public String getLoginForm() {
		return "login-form";
	}

}
