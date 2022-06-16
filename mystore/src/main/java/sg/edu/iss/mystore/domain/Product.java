package sg.edu.iss.mystore.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@Entity
public class Product {
	@Id
	private String productId;
	@Size(min=4, max=50, message="{size.Product.name.validation}")
	private String name;
	@Min(value=0, message="{min.product.unitPrice.validation}")
	@Digits(integer=8, fraction=2, message="{dgits.product.unitPrice.validation}")
	@NotNull(message= "{notNull.product.unitPrice.validation}")
	private BigDecimal unitPrice;
	private String description;
	//private String manufacturer;
	//private String category;
	//private long unitsInStock;
	//private long unitsInOrder;

	
	public Product(String productId, String name, BigDecimal unitPrice) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
	}


}
