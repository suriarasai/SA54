package sg.edu.iss.controllerdemo.controllers;


import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.controllerdemo.domain.User;
import sg.edu.iss.controllerdemo.helper.MyBag;

@Controller
public class CommonController {
	
	@GetMapping("/login")
	public String login(Model model) {
	  User u = new User();
	  model.addAttribute("user", u);
	  return "login";
	}
	
	@RequestMapping("/authenticate")
	public String login(@ModelAttribute("user") User user, HttpSession session) {
		if(user.getUsername().equalsIgnoreCase("house")) {
			MyBag p = new MyBag(user);
			session.setAttribute("profile", p);
			return "products";
		} else return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
	  session.invalidate();
	  return "logout";
	}

}
