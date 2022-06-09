package sg.edu.iss.club.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@Entity
public class Facility {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer facilityId;
	private String name;
    private String description;
	public Facility(Integer facilityId, String name, String description) {
		super();
		this.facilityId = facilityId;
		this.name = name;
		this.description = description;
	}
	public Facility(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	   
	
}
