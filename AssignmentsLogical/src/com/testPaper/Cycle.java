package com.testPaper;

public class Cycle {

	int accNumber;
	int noOfwhweels;

	// default constructor
	Cycle() {
		System.out.println("I am a Default Constructor");
	}

	// para constructor
	Cycle(int a, int b) {
		this();
		System.out.println("I am a another Constructor");
		this.accNumber = a;
		this.noOfwhweels = b;

	}

	public static void main(String[] args) {

		Cycle c = new Cycle();
		System.out.println(c);

		Cycle c1 = new Cycle(10, 10);
		System.out.println(c1);

	}

}
