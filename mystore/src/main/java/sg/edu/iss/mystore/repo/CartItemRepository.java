package sg.edu.iss.mystore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.mystore.domain.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, String> {

}
