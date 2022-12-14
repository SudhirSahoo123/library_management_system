package com.lsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homePage() {
		
		return "home/home";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		return "home/about";
	}
	
	@RequestMapping("/librarian_login")
	public String sighnin() {
		
		return "home/LibrarianLogin";
	}
	
	@RequestMapping("/admin_login")
	public String signup() {
		
		return "home/adminLogin";
	}

}
