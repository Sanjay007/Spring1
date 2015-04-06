package org.san;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseControllerHtml {

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView hello(){
		
		return new  ModelAndView("adduser","msg","Add User Page " );
			
	}
	
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	public ModelAndView save(@RequestParam Map<String, String> vars)	{
		String email=vars.get("email");
		String fname=vars.get("fname");
		String lname=vars.get("lname");

		return new  ModelAndView("success","msg","Your Email is :"+email+" AND FNAME IS :"+fname+"LNAME IS :"+lname );
		
	}
	
}
