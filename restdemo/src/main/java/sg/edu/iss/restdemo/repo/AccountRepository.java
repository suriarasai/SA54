package sg.edu.iss.restdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.restdemo.domain.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
