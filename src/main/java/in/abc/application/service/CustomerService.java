package in.abc.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abc.application.entity.Customer;
import in.abc.application.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	public Customer getCustomerById(Long customerId) {
		return customerRepo.getById(customerId);
	}
	
}
