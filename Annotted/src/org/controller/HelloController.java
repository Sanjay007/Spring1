package org.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	
	@RequestMapping("/get/{id}/{name}")
	public ModelAndView hello(@PathVariable Map<String , String> vars){
		
		String id=vars.get("id");
		String name=vars.get("name");
		
		return new  ModelAndView("index","msg","Inside Hello Id is "+id+"Name IS "+name );
		
		
	}
	
	
}
