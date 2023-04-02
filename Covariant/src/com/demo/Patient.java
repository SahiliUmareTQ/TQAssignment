package com.demo;

public abstract class Patient extends Person {

	private String illness;
	private float bill;

	Patient() {

	}

	Patient(String illness, float bill) {
		this.illness = illness;
		this.bill = bill;
	}

	void checkStatus() {

		System.out.println("I am not well");
		System.out.println("I am suffering from:" + illness);
	}

	void moneyStatus(float salary) {
		System.out.println("I have spend:" + bill);

	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public String getIllness() {
		return illness;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	public float getBill() {
		return bill;
	}

	public String toString() {
		return "Patient [" + super.toString() + " + " + illness + ", bill=" + bill + "]";
	}

}
