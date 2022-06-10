package sg.edu.iss.controllerdemo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.controllerdemo.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	ArrayList<Product> readProductsByName(String name);

}
