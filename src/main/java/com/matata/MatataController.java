package com.matata;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MatataController {

	@RequestMapping("/")
	public ModelAndView welcome() {
		System.out.println("Welcome page controller ");
		return new ModelAndView("welcome");
	}

}
