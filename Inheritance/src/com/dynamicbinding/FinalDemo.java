package com.dynamicbinding;

class Demo {
	final static int val;

	static {
		val = 90;
	}

	void display() {
		// val=val+10;
		System.out.println(val);
	}

}

class Demo2 extends Demo {

	void display() // can not override final method
	{
		// val = val + 10; // final so value not changed
		System.out.println(val);
	}

}

public class FinalDemo {

	public static void main(String[] args) {

	}

}
