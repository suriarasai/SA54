package sg.edu.iss.welcome.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.welcome.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {
	
	public ArrayList<Lecturer> queryByNickname(String s);

}
