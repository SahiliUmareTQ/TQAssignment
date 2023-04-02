package com.heirarchical;

public class Phone {

	private int id;
	private String phoneNo;
	private float bill;

	// Default constructor
	Phone() {
		System.out.println("Default constructor");
	}

	// para constructor
	Phone(int id, String phoneNo, float bill) {
		this.id = id;
		this.phoneNo = phoneNo;
		this.bill = bill;
	}

	// getter setter

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	public float getBill() {
		return bill;
	}

	// toString method

	public String toString() {
		return id + " " + phoneNo + " " + bill;
	}
}
