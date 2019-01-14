package com.SpringMVC.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageRedirection {
	
	 @RequestMapping(value = "/redirect", method = RequestMethod.GET)
	   public String redirect() {
		 System.out.println("f+++++++++++++++++++++++++++++++++++:");
	      return "redirect:fileUploadPage";
	   }
	 
	 
}
