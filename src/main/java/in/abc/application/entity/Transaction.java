package in.abc.application.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import in.abc.application.util.TransactionMode;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Date timestamp;
	
	private Double transactionAmt;
	
	private TransactionMode transactionMode;
	
	@ManyToOne
	private Account creditAccount;
	
	@ManyToOne
	private Account debitAccount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Double getTransactionAmt() {
		return transactionAmt;
	}

	public void setTransactionAmt(Double transactionAmt) {
		this.transactionAmt = transactionAmt;
	}

	public TransactionMode getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(TransactionMode transactionMode) {
		this.transactionMode = transactionMode;
	}

	public Account getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(Account creditAccount) {
		this.creditAccount = creditAccount;
	}

	public Account getDebitAccount() {
		return debitAccount;
	}

	public void setDebitAccount(Account debitAccount) {
		this.debitAccount = debitAccount;
	}

	public Transaction(long id, Date timestamp, Double transactionAmt, TransactionMode transactionMode,
			Account creditAccount, Account debitAccount) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.transactionAmt = transactionAmt;
		this.transactionMode = transactionMode;
		this.creditAccount = creditAccount;
		this.debitAccount = debitAccount;
	}

	public Transaction() {
		super();
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", timestamp=" + timestamp + ", transactionAmt=" + transactionAmt
				+ ", transactionMode=" + transactionMode + ", creditAccount=" + creditAccount + ", debitAccount="
				+ debitAccount + "]";
	}
	
	
	
	
}
