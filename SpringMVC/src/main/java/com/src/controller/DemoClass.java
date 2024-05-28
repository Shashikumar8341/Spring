package com.src.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoClass {
	
	@RequestMapping("/hello")
	public  ModelAndView sayhello(@RequestParam ("name")String name) {
		return new ModelAndView("hello","name", name);
		
	}	
	@RequestMapping("/Welcome")
	public ModelAndView Saywelcom() {
		String name="BhargavRam";
		return new ModelAndView("Welcome","name", name);
		
	}
	
}
