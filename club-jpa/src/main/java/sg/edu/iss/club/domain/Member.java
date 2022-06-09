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
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memberId;
	private String firstName;
	private String secondName;
	private String lastName;
	private String username;
	private String password;

	public Member(int memberId, String firstName, String secondName, String lastName, String username,
			String password) {
		super();
		this.memberId = memberId;
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}
	public Member(String firstName, String secondName, String lastName, String username, String password) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}

	
	
}
