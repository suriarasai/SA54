package sg.edu.iss.jpasamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.jpasamples.model.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
