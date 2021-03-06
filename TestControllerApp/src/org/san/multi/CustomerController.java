package org.san.multi;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CustomerController extends MultiActionController{
	
	public ModelAndView testaddCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		
		return new ModelAndView("CustomerPage", "msg","add() method");
			
	}
	
	public ModelAndView testdeleteCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
			
		return new ModelAndView("CustomerPage", "msg","delete() method");
				
	}
	
	public ModelAndView testupdateCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
			
		return new ModelAndView("CustomerPage", "msg","update() method");
				
	}
	
	public ModelAndView testviewCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
				
		return new ModelAndView("CustomerPage", "msg","list() method");
					
	}
	
}
