package org.san.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BaseController   {
@RequestMapping("/hi")
public ModelAndView helow(){
	
	return new ModelAndView("index","msg","Its from Hi Method");
		
}
@RequestMapping("/")
public ModelAndView defr(){
	
	return new ModelAndView("index","msg","Its from def");
		
}
@RequestMapping("/hello")
public ModelAndView hihello(){
	
	return new ModelAndView("index","msg","Its From Hello Method");
	
	
}


}
