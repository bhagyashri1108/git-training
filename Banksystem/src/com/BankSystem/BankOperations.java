package com.BankSystem;

public class BankOperations {
	
	String Name;
	long AccountId;
	long Amount;
	long Balance;
	
	public BankOperations(String name, long accountId, long balance) {
		Name = name;
		AccountId = accountId;
		Balance = balance;
	}

	public long getBalance(long AccountID) {
		return Balance;
	}
	
	public void setBalance(int Balance) {
		this.Balance=Balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getAccountId() {
		return AccountId;
	}

	public void setAccountId(long accountId) {
		AccountId = accountId;
	}

	public long getAmount() {
		return Amount;
	}

	public void setAmount(long amount) {
		Amount = amount;
	}
	
}
