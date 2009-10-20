package com.foo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/helloWorld")
	public ModelAndView helloWorld(){
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("helloWorld");
		modelAndView.addObject("message", "Hello World!");
		return modelAndView;
	}
}
