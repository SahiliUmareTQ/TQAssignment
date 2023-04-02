package com.wrapper;

class A1 {
	A1 type() {
		return this;
	}

	void print() {
		System.out.println("class A1");
	}
}

class A2 extends A1 {
	@Override
	A2 type() {
		return this;
	}

	void print() {
		System.out.println("class A2 ");
	}

}

class A3 extends A2 {
	A3 type() {
		return this;
	}

	void print() {
		System.out.println("class A3 ");
	}
}

public class CovariantExampl {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.type();
		a1.print();

		A2 a2 = new A2();
		a2.type();
		a2.print();

		A3 a3 = new A3();
		a3.type();
		a3.print();
	}

}
