package org.san.multi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class BaseController {

	
	@RequestMapping("/add")
	public ModelAndView hello(){
		
		
		return new  ModelAndView("CustomerPage","msg","add()");
		
	}
	
	@RequestMapping("/del")
	public ModelAndView deletr(){
		
		
		return new  ModelAndView("CustomerPage","msg","del()");
		
	}
}
