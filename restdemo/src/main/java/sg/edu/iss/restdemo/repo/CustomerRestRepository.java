package sg.edu.iss.restdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sg.edu.iss.restdemo.domain.Customer;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRestRepository extends JpaRepository<Customer, Integer> {

}
