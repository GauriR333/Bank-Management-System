package com.power.account;

public class SavingAccount extends Account{
	

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(long accountNo, String accountName, double amount) {
		super(accountNo, accountName, amount);
		
	}

	public void deposit(double amount) {
		
		setAmount(getAmount()+amount);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("your Amount is deposited sucessfully ypur current balance is: "+getAmount());
		System.out.println("----------------------------------------------------------------------------");
	}

}
