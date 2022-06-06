package sg.edu.iss.jpasamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.jpasamples.model.LineItem;

public interface LineItemRepo extends JpaRepository<LineItem, Integer> {

}
