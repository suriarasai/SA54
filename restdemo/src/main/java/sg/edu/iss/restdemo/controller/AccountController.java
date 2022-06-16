package sg.edu.iss.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.restdemo.domain.Account;
import sg.edu.iss.restdemo.repo.AccountRepository;

@RestController
@RequestMapping(path = "/api/account", produces = "application/json")
@CrossOrigin(origins = "http://localhost:8080")
public class AccountController {
	
	@Autowired 
	AccountRepository arepo;
	
	@GetMapping("/list")
	public List<Account> getAccount() {
		return arepo.findAll();
	}

}
