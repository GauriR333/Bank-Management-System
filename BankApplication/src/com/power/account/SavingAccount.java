package com.power.account;

public class SavingAccount extends Account {

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void deposit(double amount) {

		setBalance(getBalance() + amount);
		System.out.println("\n\t\tYour amount is deposited sucessfully.\n\t\tYour current balance is: " + getBalance());
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > 10000) {
			setBalance(getBalance() - amount);
			System.out.println(
					"\n\t\tYour amount is withdraw sucessfully.\n\t\tYour current balance is: " + getBalance());
		} else {
			System.out.println("\n\t\tInsufficent blance you must have atleast 10000 deposited in your account");
		}
	}
}
