package sg.edu.iss.jpasamples.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.jpasamples.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	ArrayList<Product> readProductsByName(String name);

}
