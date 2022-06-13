package sg.edu.iss.controllerdemo.service;

import org.springframework.stereotype.Service;

@Service
public class BusinessLogicImpl1 implements BusinessLogic {


	@Override
	public Double countAllBooks(int choice) {
		// TODO Auto-generated method stub
		// Logic 1
		if (choice == 1)
			return 10.0;
		else return 20.0;
	}

}
