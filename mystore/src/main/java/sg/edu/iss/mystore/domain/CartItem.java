package sg.edu.iss.mystore.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@Entity
public class CartItem {
	   @Id
	   private String id;
	   @ManyToOne(targetEntity = Product.class, fetch = FetchType.EAGER)
	   private Product product;
	   private int quantity;
	   private BigDecimal totalPrice;
	   
	   public CartItem(String id) {
		      super();
		      this.id = id;
		   }

}
