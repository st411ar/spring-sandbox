package org.st411ar.spring.sandbox.controllers;


import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	@GetMapping("/")
	public ModelAndView index() {
		Map<String, String> model = new HashMap<>();
		model.put("name", "Vitaly");
		return new ModelAndView("index", model);
	}
}