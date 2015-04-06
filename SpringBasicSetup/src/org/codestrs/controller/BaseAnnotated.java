package org.codestrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BaseAnnotated {

	
	@RequestMapping("/")
	public ModelAndView getmainPage(){
		
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("msg","Annotated Controller");
		return mv;
		
		
	}
	
}
