package io.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HomeController {

	@GetMapping
	public ModelAndView getHome() {
		ModelAndView view = new ModelAndView("home");
		return view;
	}
}
