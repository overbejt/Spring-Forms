package com.josh.first.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/register")
	public String showForm() {
		return "register_form";
	}
}  // End of the 'MainController' class
