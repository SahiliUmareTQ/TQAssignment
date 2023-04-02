package com.heirarchical;

class demo {
	int value;

	void show() {
		value = 10;
	}

	void display() {
		System.out.println("welcome");
	}

}

class child extends demo {
	int value;
	{
		value = 100;
	}

	void show() {
		value = 10;
	}

	void display() {
		System.out.println("welcome to Java");
	}

	public class Superdemo {
		public static void main(String[] args) {

			child c = new child();
			c.show();
			c.display();

		}

	}
}