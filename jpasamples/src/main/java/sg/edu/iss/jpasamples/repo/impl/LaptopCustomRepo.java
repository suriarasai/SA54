package sg.edu.iss.jpasamples.repo.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.iss.jpasamples.model.Laptop;
import sg.edu.iss.jpasamples.repo.LaptopRepo1;

public class LaptopCustomRepo implements LaptopRepo1{
	
	@Autowired
	EntityManager em;
	
	public Laptop anyMethod() {
		return null;
	}

}
