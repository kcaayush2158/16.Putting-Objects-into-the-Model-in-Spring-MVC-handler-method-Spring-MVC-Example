package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomepage() {
		return "welcomePage";
	}

	@ModelAttribute
	public void modelData(Model model) {
		model.addAttribute("welcomeMessage", "welocome to www,infotech.com");
		model.addAttribute("headerMessage", "welcome to header message");

	}
}
