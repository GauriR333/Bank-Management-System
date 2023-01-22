package com.power.BankApplication;

import java.util.Scanner;

public class BankApp {
	public static void main(String args[]) {
		BankApp bankapp1 = new BankApp();

		int choice = 0;
		while (choice != 9) {
			System.out.print("--------------WELCOME-CITYBANK-----------------\n");

			System.out.println("1. Customers ");
			System.out.println("9. Exit");

			System.out.println("Enter your choice: ");
			Scanner sc = new Scanner(System.in);
			int choiceNew = sc.nextInt();

			switch (choiceNew) {
			case 1:
				System.out.println("1.Add Customer ");
				System.out.println("2.Account Activites");
				System.out.println("3.Show Customer Detail");

				System.out.println("Enter your choice: ");
				Scanner sc2 = new Scanner(System.in);
				int choice1 = sc.nextInt();
				switch (choice1) {
				case 1:
					bankapp1.addCustomer();
					break;
				case 3:
					bankapp1.showCustomerDetail();
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

	private void addCustomer() {
		System.out.println("Fill-Up Cutomer information:-");
		Customer customer1 = new Customer();
		customer1.setCutomer_id();
		System.out.println("Enter customer id: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		customer1.setCustomer_name(null);
		System.out.println("Enter customer name");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.next();

		customer1.setCustomer_address(null);
		System.out.println("Enter customer Address");
		Scanner sc2 = new Scanner(System.in);
		String address = sc2.next();

		System.out.println("Enter customer phone number");
		Scanner sc3 = new Scanner(System.in);
		long phoneNumber = sc3.nextLong();

		System.out.println("Customer Detailes: ");
		System.out.println("Id:" + id);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("phone Number: " + phoneNumber);
		// customer1.getCutomer_id();
//		customer1.getCustomer_name();
//		customer1.getCustomer_address();
	}

	private void showCustomerDetail() {
		System.out.println("Customer Detailes: ");
		System.out.println("Id:");
		System.out.println("Name: ");
		System.out.println("Address: ");
		System.out.println("phone Number: ");
	}
}
