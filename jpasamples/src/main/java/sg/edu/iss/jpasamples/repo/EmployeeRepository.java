package sg.edu.iss.jpasamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.jpasamples.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
