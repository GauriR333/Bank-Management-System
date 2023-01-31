package com.power.account;

public class Account {
	private long accountNo;
	private int customerId;
	private double balance;

	public Account() {

	}

	

	public int getCustomerId() {
		return customerId;
	}



	public Account(long accountNo, int customerId, double balance) {
		super();
		this.accountNo = accountNo;
		this.customerId = customerId;
		this.balance = balance;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
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

	public void checkBalance() {
		System.out.println("your current blance is " + balance);
	}
}
