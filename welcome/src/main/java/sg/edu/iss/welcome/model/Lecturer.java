package sg.edu.iss.welcome.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
@Entity
public class Lecturer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String nickname;
	private double salary;
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lecturer other = (Lecturer) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	public Lecturer(String name, String nickname, double salary) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.salary = salary;
	}

}
