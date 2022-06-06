package sg.edu.iss.jpasamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.jpasamples.model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
