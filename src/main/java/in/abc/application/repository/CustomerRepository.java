package in.abc.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abc.application.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
