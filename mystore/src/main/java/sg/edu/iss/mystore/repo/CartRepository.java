package sg.edu.iss.mystore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.mystore.domain.Cart;

public interface CartRepository extends JpaRepository<Cart, String> {

}
