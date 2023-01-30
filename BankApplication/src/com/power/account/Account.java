package com.power.account;

public class Account {
	private long accountNo;
	private String accountName;
	private double amount;
	

	public Account() {

	}
	

	public Account(long accountNo, String accountName, double amount) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.amount = amount;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void deposit(double amount) {
		
	}
	public void withdrew() {
		
	}
	
}
