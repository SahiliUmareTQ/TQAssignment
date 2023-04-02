package com.dynamicbinding;

class Bank {
	protected float rate;

	void getRateOfInterest() {
		rate = 0f;
	}
}

class HdfcBank extends Bank {
	void getRateOfInterest() {
		System.out.println("hi");
		rate = 8.5f;
	}

}

class CanaraBank extends Bank {
	void getRateOfInterest() {
		System.out.println("hello");
		rate = 9.0f;
	}

}

public class BankIntrestOverriding {

	public static void main(String[] args) {

		Bank bank;
		bank = new HdfcBank();
		bank.getRateOfInterest();

		bank = new CanaraBank();
		bank.getRateOfInterest();
	}

}
