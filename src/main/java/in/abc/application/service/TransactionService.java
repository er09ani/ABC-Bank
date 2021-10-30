package in.abc.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abc.application.entity.Transaction;
import in.abc.application.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	TransactionRepository transactionRepo;
	
	public void createTransaction(Transaction transaction) {
		transactionRepo.save(transaction);
	}
	
//	public List<Transaction> getAllTransactions(Long accountId){
//		return transactionRepo
//	}
}
