package sg.edu.iss.controllerdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import sg.edu.iss.controllerdemo.service.BusinessLogic;

@Controller
public class BusinessController {
	
	@Autowired
	BusinessLogic blogic;
	
	
	
	
	public String someUCCall() {
		Double d = blogic.countAllBooks(1);
		//new Operator or any constructor
		
		return "";
	}

}
