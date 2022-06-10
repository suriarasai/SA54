package sg.edu.iss.controllerdemo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	private String name;
	private String description;
	private Double price;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dom;
	public Product(String name, String description, Double price, Date dom) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.dom = dom;
	}
	
}
