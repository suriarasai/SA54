package sg.edu.iss.controllerdemo.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String brand;
	private String description;
	private Double price;
	
	private LocalDate dom;
	public Product(int id, String name, String brand, String description, Double price, LocalDate dom) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.dom = dom;
	}
	public Product(String name, String brand, String description, Double price, LocalDate dom) {
		super();
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.dom = dom;
	}
	
	
}
