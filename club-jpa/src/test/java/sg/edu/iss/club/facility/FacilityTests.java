package sg.edu.iss.club.facility;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import sg.edu.iss.club.domain.Facility;
import sg.edu.iss.club.repo.FacilityRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class FacilityTests {

	@Autowired
	private FacilityRepository frepo;

	@Test
	@Order(1)
	public void createFacilty() {
		Facility f = new Facility("Function Room1",
				"1500sft space. Suitable for creative workshops, presentations and seminars.");
		frepo.saveAndFlush(f);
		System.out.println("ID IS " + f.getFacilityId());
		Assertions.assertNotNull(f.getFacilityId());
	}

	@Test
	@Order(2)
	public void findFacityByName() {
		Facility f = new Facility("Function Room1",
				"1500sft space. Suitable for creative workshops, presentations and seminars.");
		frepo.saveAndFlush(f);
		List<Facility> fl = frepo.findFacilitiesByName("Function Room1");
		Assertions.assertEquals(fl.size(), 1L);
	}

	@Test
	@Order(3)
	public void findFacility() 	{
		Facility f = new Facility("Function Room1",
				"1500sft space. Suitable for creative workshops, presentations and seminars.");
		frepo.saveAndFlush(f);
		Optional<Facility> fl = frepo.findById(1);
		Assertions.assertTrue(fl.isPresent());
	}

	@Test
	@Order(4)
	public void modifyFacilty() {
		Facility f = new Facility("Function Room1",
				"1500sft space. Suitable for creative workshops, presentations and seminars.");
		frepo.saveAndFlush(f);
		Facility mf = frepo.findFacilitiesByName("Function").get(0);
		f.setDescription("Changed Room Size. More suitable for creative workshops, presentations and seminars.");
		frepo.saveAndFlush(mf);
		Assertions.assertNotNull(f.getFacilityId());
	}

	@Test
	@Order(5)
	public void deleteFacilty() {
		Facility f = new Facility("Function Room1",
				"1500sft space. Suitable for creative workshops, presentations and seminars.");
		frepo.saveAndFlush(f);
		Facility df = frepo.findFacilitiesByName("Function").get(1);
		frepo.delete(df);
		Assertions.assertNull(f.getFacilityId());
	}

}
