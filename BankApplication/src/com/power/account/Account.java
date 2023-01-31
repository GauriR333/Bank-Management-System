package com.power.account;

public class Account {
	private long accountNo;
	private String accountName;
	private double balance;
	

	public Account() {

	}
	
	public Account(long accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}


	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double amount) {
		this.balance = amount;
	}
	public void deposit(double amount) {
		
	}
	public void withdraw(double amount) {
		
	}
	
}
