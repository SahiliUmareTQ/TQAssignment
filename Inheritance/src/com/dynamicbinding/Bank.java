package com.dynamicbinding;

class Account {
	void method() {
		float amount = 1000;
		System.out.println("Rate of interest is 2%");
	}

}

class SavingAccount extends Account {

	void method1() {
		int amount = 0;
		double interest = amount * 0.03;
		System.out.println("Rate of interest is 3%");
	}

}

class CurrentAccount extends Account {

	void method2() {
		System.out.println("Rate of interest is 5%");
	}

	public class Bank {

		public static void main(String[] args) {

		}

	}
}