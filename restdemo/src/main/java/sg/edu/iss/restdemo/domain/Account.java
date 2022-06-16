package sg.edu.iss.restdemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Account {
	@Id
	private String accountNo;
	private String name;
	private Double amount;
	

}
