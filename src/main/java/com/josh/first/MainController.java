package com.josh.first;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	/**
	 * This is the method that will handle a GET request for the register_form page. 
	 * @param model
	 * @return
	 */
	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		// For the drop down list\
		List<String> professionList = Arrays.asList("Developer", "Designer", "Architecht");
		model.addAttribute("professionList", professionList);
		return "register_form";
	}  // End of the 'showForm' method
	
	/**
	 * This is the method that will handle the POST request for submitting the form.
	 * @param user
	 * @return
	 */
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "register_success";
	}  // End of the 'submitForm' method
	
//	@GetMapping("/")
}  // End of the 'MainController' class
