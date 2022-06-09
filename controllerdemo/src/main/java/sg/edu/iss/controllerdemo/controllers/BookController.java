package sg.edu.iss.controllerdemo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.controllerdemo.domain.Book;
import sg.edu.iss.controllerdemo.repo.BookRepository;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookRepository brepo;
	
	// If return is a html page - string of file name will suffice
	// if the return type is another controller
	// 1. forward (within the same application)
	// 2. redirect (outside the application) //3XX HTTP Code
	
	@GetMapping("/add")
	public String loadForm(Model model) {
		Book b = new Book();
		model.addAttribute("book", b);
		return "bookform";
	}
	
	@PostMapping("/save")
	public String saveForm(@ModelAttribute("book") Book b) {
		brepo.save(b);
		return "forward:/book/list";
	}
	
	@RequestMapping("/list")
	public String listPage(Model model) {
		List<Book> blist =  brepo.findAll();
		model.addAttribute("booksdata",blist);
		return "books";
	}
	
	/*
	 * @GetMapping("/edit") public String loadForm(Model model) { Book b = new
	 * Book(); model.addAttribute("book", b); return "bookform"; }
	 * 
	 * @GetMapping("/delete") public String loadForm(Model model) { Book b = new
	 * Book(); model.addAttribute("book", b); return "bookform"; }
	 */

}
