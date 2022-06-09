package sg.edu.iss.jpasamples.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String nickName;
	private Double cap;
	@OneToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name="STU_LAP")
	private Laptop owns;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String nickName, Double cap) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.cap = cap;
	}
		
	
	

}
