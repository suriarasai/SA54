package sg.edu.iss.mystore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.mystore.domain.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
