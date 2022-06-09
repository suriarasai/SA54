package sg.edu.iss.jpasamples.unittests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import sg.edu.iss.jpasamples.model.Laptop;
import sg.edu.iss.jpasamples.model.Student;
import sg.edu.iss.jpasamples.repo.LaptopRepository;
import sg.edu.iss.jpasamples.repo.StudentRepository;

@DataJpaTest
public class StudentUnitTests {
	
	@Autowired
	StudentRepository srepo;
	
	@Autowired
	LaptopRepository lrepo;
	
	/*
	 * @Test
	 * 
	 * @Order(1) public void testCreateSL() {
	 * 
	 * Laptop l = new Laptop("TP",2050.50); lrepo.save(l); Student s = new
	 * Student("Aye Mya Phoo", "Brilliant Colors!", 5.0); s.setOwns(l);
	 * srepo.saveAndFlush(s); Assertions.assertNotNull(s.getId());
	 * 
	 * }
	 */
	
	@Test
	@Order(2)
	public void testCreateSL() {
		Laptop l = new Laptop("TP",2050.50);
		lrepo.save(l);
		Student s = new Student("Aye Mya Phoo", "Brilliant Colors!", 5.0);
		s.setOwns(l);
		srepo.saveAndFlush(s);
		System.out.println(s.toString());
		Assertions.assertNotNull(s.getId());
		Student student = srepo.findById(s.getId()).get();
		System.out.println(student.toString());
	}
	
	

}
