package sg.edu.iss.mystore.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
	   @OneToOne(fetch = FetchType.EAGER)
	   private Product product;
	   private int quantity;
	   private Double totalPrice;
	   
	   public CartItem(String id) {
		      super();
		      this.id = id;
		   }

}
