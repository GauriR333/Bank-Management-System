package com.power.BankApplication;

import java.util.ArrayList;
import java.util.Scanner;

import com.power.account.Account;
import com.power.account.SavingAccount;

public class BankApp {
	public static void main(String args[]) {

		BankApp bankapp1 = new BankApp();

		ArrayList<Customer> customers = new ArrayList<Customer>();
		int choice = 0;

		while (choice != 9) {
			System.out.print("--------------WELCOME-CITYBANK-----------------\n");

			System.out.println("1. Customers ");
			System.out.println("9. Exit");
			System.out.print("Enter your choice: ");

			Scanner sc = new Scanner(System.in);
			int choiceNew = sc.nextInt();

			switch (choiceNew) {
			case 1:
				System.out.println("\t1. Add Customer ");
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
					System.out.println("\t\t1.Saving Account");
					System.out.print("\t\tEnter Your choice: ");
					int choice2 = sc3.nextInt();
					switch (choice2) {
					case 1:
						Account acc1 = new SavingAccount(1234, "Acc1", 2000);
						System.out.println("\t\t1.Deposit ");
						System.out.println("\t\t2.Withdraw ");
						System.out.print("\t\tEnter Your choice: ");
						int ch = sc3.nextInt();

						if (ch == 1) {
							System.out.print("\t\tEnter amount to deposit: ");
							double amount = sc3.nextDouble();
							acc1.deposit(amount);
						}
						if (ch == 2) {
							System.out.print("\t\tEnter amount to withdraw: ");
							double amount = sc3.nextDouble();
							acc1.withdraw(amount);
						}

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
}
