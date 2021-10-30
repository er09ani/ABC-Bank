package in.abc.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abc.application.entity.Account;
import in.abc.application.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepo;
	
	public Account createAccount(Account account) {
		return accountRepo.save(account);
	}
	
	public Account getAccountById(Long accountId) {
		return accountRepo.findById(accountId).get();
	}
	
	public List<Account> getAccountByCustomerId(Long customerId) {
		return null;
	}
	
	public void removeAccount(Long accountId) {
		accountRepo.deleteById(accountId);
	}
	
	public Account updateAccount(Account account, Long accountId) {
		Account accountToUpdate = accountRepo.getById(accountId);
		if(account != null)
			accountToUpdate.setBalance(account.getBalance());
		
		return accountRepo.save(accountToUpdate);
	}
	
	public void deleteAllAccounts() {
		accountRepo.deleteAll();
	}
}
