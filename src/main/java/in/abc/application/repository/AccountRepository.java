package in.abc.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abc.application.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
