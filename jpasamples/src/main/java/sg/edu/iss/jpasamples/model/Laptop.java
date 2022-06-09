package sg.edu.iss.jpasamples.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String model;
	private Double price;
	@OneToOne(mappedBy = "owns")
	private Student belongsTo;
	public Laptop(String model, Double price) {
		super();
		this.model = model;
		this.price = price;
	}
	

}
