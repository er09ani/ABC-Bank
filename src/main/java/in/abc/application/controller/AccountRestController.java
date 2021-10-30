package in.abc.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.abc.application.entity.Account;
import in.abc.application.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountRestController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping()
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		Account newAccount = accountService.createAccount(account);
		return new ResponseEntity<Account>(newAccount, HttpStatus.CREATED);
	}
	
	@GetMapping("/{accountId}")
	public ResponseEntity<Account> getAccountById(@PathVariable long accountId){
		Account account = accountService.getAccountById(accountId);
		return new ResponseEntity<Account>(account, HttpStatus.FOUND);
	}
	
	@PutMapping("/{accountId}")
	public ResponseEntity<Account> updateAccount(@RequestBody Account account, @PathVariable long accountId) {
		Account ac = accountService.updateAccount(account, accountId);
		
		return new ResponseEntity<Account>(ac, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{accountId}")
	public void deleteAccountById(@PathVariable long accountId) {
		Account account = accountService.getAccountById(accountId);
		accountService.removeAccount(accountId);
	}
}
