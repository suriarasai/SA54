package sg.edu.iss.jpasamples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="address")
@Data
@NoArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String street;
	private String city;
	private String country;

	
	public Address(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}
	
}
