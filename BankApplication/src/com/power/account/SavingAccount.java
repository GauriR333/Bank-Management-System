package com.power.account;

public class SavingAccount extends Account {

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(long accountNo, String accountName, double amount) {
		super(accountNo, accountName, amount);

	}

	public void deposit(double amount) {

		setBalance(getBalance() + amount);
		System.out.println("your Amount is deposited sucessfully your current balance is: " + getBalance());
	}

	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
		System.out.println("Your Amount is withdraw sucessfully your current balance is: " + getBalance());
	}

}
