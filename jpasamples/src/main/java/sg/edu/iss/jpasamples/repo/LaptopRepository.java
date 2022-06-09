package sg.edu.iss.jpasamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.jpasamples.model.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
