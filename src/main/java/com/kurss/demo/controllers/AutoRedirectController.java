package com.kurss.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Used to redirect localhost:8080 straight to main page

@Controller
public class AutoRedirectController {
	@GetMapping
	public String redirectToMainPage()
	{
		return "redirect:/main";
	}
}
