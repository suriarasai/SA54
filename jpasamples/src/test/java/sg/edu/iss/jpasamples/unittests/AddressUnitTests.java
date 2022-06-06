package sg.edu.iss.jpasamples.unittests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import sg.edu.iss.jpasamples.model.Address;
import sg.edu.iss.jpasamples.repo.AddressRepo;

@DataJpaTest
public class AddressUnitTests {
	 @Autowired
	  TestEntityManager em;

	  @Autowired
	  private AddressRepo repository;

	  @Test
	  @Order(1)
	  public void contextLoads() {
	    Assertions.assertNotNull(em);
	  }
	  
	  @Test
	  @Order(2)
	  void verifyBootstrappingByPersistingAnAddress() {
	   Address a = new Address("Heng Mui Keng Terrace", "Singapore", "Singapore");
	    Assertions.assertNull(a.getAddressId());
	    em.persist(a);
	    Assertions.assertNotNull(a.getAddressId());
	  }
	  
	  @Test
	  @Order(3)
	  void verifyRepositoryByPersistingAnAddress() {
	   Address a = new Address("Bouna Vista", "Singapore", "Singapore");
	    Assertions.assertNull(a.getAddressId());
	    repository.save(a);
	    Assertions.assertNotNull(a.getAddressId());
	  }
	  
	  
}
