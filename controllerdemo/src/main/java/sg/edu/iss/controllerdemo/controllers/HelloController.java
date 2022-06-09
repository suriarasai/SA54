package sg.edu.iss.controllerdemo.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.controllerdemo.domain.Book;
import sg.edu.iss.controllerdemo.repo.BookRepository;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	BookRepository brepo;
	
	@GetMapping("/welcome")
	public String welcomeMethod(Model model) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy");
		Date date = calendar.getTime();
		String today = date.toLocaleString();
		//String yesterday = calendar.add(DATE, -1);
		model.addAttribute("tod", today);
		return "welcome";
	}
	
	@GetMapping("/bookdetails/{isbn}") 
	public String displayDetail(@PathVariable("isbn") String i1,  Model model) {
		Book b = (Book) brepo.findById(Integer.parseInt(i1)).get();
		model.addAttribute("book", b);
		return "details";
		
	}

}
