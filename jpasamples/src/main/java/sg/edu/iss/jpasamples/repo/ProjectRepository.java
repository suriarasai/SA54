package sg.edu.iss.jpasamples.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.jpasamples.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}