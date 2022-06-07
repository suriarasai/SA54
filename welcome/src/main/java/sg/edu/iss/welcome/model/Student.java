package sg.edu.iss.welcome.model;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String nickName;
	private Double cap;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Double getCap() {
		return cap;
	}
	public void setCap(Double cap) {
		this.cap = cap;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", nickName=" + nickName + ", cap=" + cap + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	

}
