package sg.edu.iss.jpasamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.jpasamples.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
