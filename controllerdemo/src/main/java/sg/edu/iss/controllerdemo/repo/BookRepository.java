package sg.edu.iss.controllerdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.controllerdemo.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
