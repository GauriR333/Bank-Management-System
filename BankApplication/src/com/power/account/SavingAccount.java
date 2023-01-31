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
		if (getBalance() - amount > 10000) {
			setBalance(getBalance() - amount);
			System.out.println("Your Amount is withdraw sucessfully your current balance is: " + getBalance());
		}
		else {
			System.out.println("");
			System.out.println("\t\tInsufficent blance you must have atleast 10000 deposited in your account");
			System.out.println("");
		}
		}
	}


