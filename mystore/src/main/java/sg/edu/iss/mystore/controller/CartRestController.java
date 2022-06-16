package sg.edu.iss.mystore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.mystore.domain.Cart;
import sg.edu.iss.mystore.domain.CartItem;
import sg.edu.iss.mystore.domain.Product;
import sg.edu.iss.mystore.repo.CartRepository;
import sg.edu.iss.mystore.repo.ProductRepository;

@RestController
@RequestMapping(value = "/api/cart")
public class CartRestController {
	
	   @Autowired
	   private CartRepository cartrepo;
	   
	   @Autowired
	   private ProductRepository prepo;
	   
	   @RequestMapping(method = RequestMethod.POST)
	   @ResponseStatus(value = HttpStatus.CREATED)
	   public void create(@RequestBody Cart cart) {
		   cartrepo.save(cart);
	   }

	   @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
	   public Cart read(@PathVariable(value = "cartId") String cartId) {
	      return cartrepo.findById(cartId).get();
	   }

	   @RequestMapping(value = "/{cartId}", method = RequestMethod.PUT)
	   @ResponseStatus(value = HttpStatus.OK)
	   public void update(@PathVariable(value = "cartId") String cartId, @RequestBody Cart cart) {
	      cart.setId(cartId);
	      cartrepo.save(cart);
	   }

	   @RequestMapping(value = "/{cartId}", method = RequestMethod.DELETE)
	   @ResponseStatus(value = HttpStatus.OK)
	   public void delete(@PathVariable(value = "cartId") String cartId) {
		   cartrepo.deleteById(cartId);
	   }
	      
	   @RequestMapping(value = "/{cartId}/add/{productId}", method = RequestMethod.PUT)
	   @ResponseStatus(value = HttpStatus.OK)
	   public void addItem(@PathVariable(value = "cartId") String cartId, @PathVariable(value = "productId") String productId, HttpSession session) {
		  Product p = prepo.findById(productId).get();
		  Cart c = cartrepo.findById(cartId).get();
		  List<CartItem> cilist = new ArrayList<CartItem>();
		  CartItem ci = new CartItem();
		  ci.setProduct(p); ci.setQuantity(1);
		  cilist.add(ci);
		  c.setCartItems(cilist);
		  cartrepo.save(c);
	   }
	   
	   @RequestMapping(value = "/{cartId}/remove/{productId}", method = RequestMethod.PUT)
	   @ResponseStatus(value = HttpStatus.OK)
	   public void removeItem(@PathVariable(value = "cartId") String cartId, @PathVariable(value = "productId") String productId, HttpSession session) {
		   Product p = prepo.findById(productId).get();
			  Cart c = cartrepo.findById(cartId).get();
			  List<CartItem> cilist = c.getCartItems();
			  for (CartItem cartItem : cilist) {
				  if (p.getProductId().equalsIgnoreCase(cartItem.getProduct().getProductId()))
					  cilist.remove(cartItem);
			   }
			  c.setCartItems(cilist);
			  cartrepo.save(c);
	   }

}
