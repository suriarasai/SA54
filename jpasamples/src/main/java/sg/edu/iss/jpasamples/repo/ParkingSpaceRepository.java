package sg.edu.iss.jpasamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.jpasamples.model.ParkingSpace;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Integer>{

}
