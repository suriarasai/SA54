package sg.edu.iss.welcome.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.welcome.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	//@Query("from Student s where s.nickName = ?1")
	@Query("from Student s where s.nickName = :nn")
	public ArrayList<Student> funnyNameOne(@Param("nn") String nickName);
	
	//@Query("",native=true);

}
