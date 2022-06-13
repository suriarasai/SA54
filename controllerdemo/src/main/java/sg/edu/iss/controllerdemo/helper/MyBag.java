package sg.edu.iss.controllerdemo.helper;

import sg.edu.iss.controllerdemo.domain.User;

public class MyBag {
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MyBag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyBag(User user) {
		super();
		this.user = user;
	}

	

}
