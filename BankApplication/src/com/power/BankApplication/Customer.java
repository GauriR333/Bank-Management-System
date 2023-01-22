package com.power.BankApplication;

public class Customer {
	int cutomer_id;
	String customer_name;
	String customer_address;
	long phone_no;

	public Customer() {

	}

	public Customer(int cutomer_id, String customer_name, String customer_address, long phone_no) {
		super();
		this.cutomer_id = cutomer_id;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		this.phone_no = phone_no;
	}

	public int getCutomer_id() {
		return cutomer_id;
	}

	public void setCutomer_id(int cutomer_id) {
		this.cutomer_id = cutomer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	

}
