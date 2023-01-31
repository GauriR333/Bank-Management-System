package com.power.BankApplication;

import java.util.ArrayList;
import java.util.Scanner;

import com.power.account.Account;
import com.power.account.SavingAccount;

public class BankApp {
	public static void main(String args[]) {

		BankApp bankapp1 = new BankApp();

		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<SavingAccount> savingAccounts = new ArrayList<SavingAccount>();
		int choice = 0;

		while (choice != 9) {
			System.out.println("--------------WELCOME-CITYBANK-----------------");

			System.out.println("1. Customers ");
			System.out.println("9. Exit");
			System.out.print("Enter your choice: ");

			Scanner sc = new Scanner(System.in);
			int choiceNew = sc.nextInt();

			switch (choiceNew) {
			case 1:
				System.out.println("\n\t1. Add Customer ");
				System.out.println("\t2. Account Activities");
				System.out.println("\t3. Show Customer Detail");

				System.out.print("\tEnter your choice: ");
				Scanner sc2 = new Scanner(System.in);
				int choice1 = sc.nextInt();

				switch (choice1) {
				case 1:
					bankapp1.addCustomer(customers);
					break;

				case 2:
					Scanner sc3 = new Scanner(System.in);
					System.out.println("\n\t\t1.Saving Account");
					System.out.print("\t\tEnter Your choice: ");
					int choice2 = sc3.nextInt();
					switch (choice2) {
					case 1:
						int exit = 1;
						// Account acc1 = new SavingAccount(1234, "125", 20000);
						do {
							System.out.println("\n\t\t1. Deposit ");
							System.out.println("\t\t2. Withdraw ");
							System.out.println("\t\t3. Check Blance ");
							System.out.println("\t\t4. Create Account");
							System.out.println("\t\t5. Show All Accounts");
							System.out.println("\t\t9.Back to main menu");
							System.out.print("\t\tEnter Your choice: ");
							int ch = sc3.nextInt();

							if (ch == 1) {
								System.out.print("\t\tEnter amount to deposit: ");
								double amount = sc3.nextDouble();
								// acc1.deposit(amount);

							} else if (ch == 2) {
								System.out.print("\t\tEnter amount to withdraw: ");
								double amount = sc3.nextDouble();
								// acc1.withdraw(amount);

							} else if (ch == 3) {
								// acc1.checkBalance();

							} else if (ch == 4) {
								bankapp1.createSavingAccount(savingAccounts);

							} else if (ch == 5) {
								bankapp1.showAccount(savingAccounts);
							} else if (ch == 9) {
								exit = 9;
							}

						} while (exit != 9);
						break;
					default:
						break;
					}
					break;

				case 3:
					bankapp1.showCustomerDetail(customers);
					break;

				default:
					break;

				}

				break;

			case 9:
				choice = 9;
				break;

			default:
				System.out.println("Give right choice");
				break;
			}
		}
	}

	private void addCustomer(ArrayList<Customer> customers) {

		System.out.println("\tFill-Up Cutomer information:-");
		Customer customer1 = new Customer();

		System.out.print("\tEnter customer id: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		customer1.setCutomer_id(id);

		System.out.print("\tEnter customer name: ");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.next();
		customer1.setCustomer_name(name);

		System.out.print("\tEnter customer Address: ");
		Scanner sc2 = new Scanner(System.in);
		String address = sc2.next();
		customer1.setCustomer_address(address);

		System.out.print("\tEnter customer phone number: ");
		Scanner sc3 = new Scanner(System.in);
		long phoneNumber = sc3.nextLong();
		customer1.setPhone_no(phoneNumber);

		customers.add(customer1);// customer1 object added into list

	}

	private void showCustomerDetail(ArrayList<Customer> coustomers) {

		System.out.println("\t---------------------Customer Detailes: -----------------------");
		System.out.println("\tId" + "\t" + "Name" + "\t" + "Address" + "\t" + "Phone number");

		for (Customer customer : coustomers) {
			System.out.println("\t" + customer.getCutomer_id() + "\t" + customer.getCustomer_name() + "\t"
					+ customer.getCustomer_address() + "\t" + customer.getPhone_no() + "\t");

		}

		System.out.println("\t---------------------------------------------------------------");
	}

	private void createSavingAccount(ArrayList<SavingAccount> savingAccounts) {
		System.out.print("\n\t\tEnter customer Id:");
		Scanner sc = new Scanner(System.in);
		int cutomerId = sc.nextInt();
		System.out.print("\t\tEnter account number:");
		int accountNumber = sc.nextInt();

		SavingAccount savingAcc = new SavingAccount();
		savingAcc.setCustomerId(cutomerId);
		savingAcc.setAccountNo(accountNumber);
		 savingAccounts.add(savingAcc); // savingAccounts object add in ArrayList
	}

	private void showAccount(ArrayList<SavingAccount> savingAccounts) {
		System.out.println("\n\t\tAccount details:");
		System.out.println("\t\tCustomer Id\tAccount No.");
		for (SavingAccount SavingAccount : savingAccounts) {
			System.out.println("\t\t" + SavingAccount.getCustomerId() + "\t\t" + SavingAccount.getAccountNo());
		}
	}
}
