package in.abc.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abc.application.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
