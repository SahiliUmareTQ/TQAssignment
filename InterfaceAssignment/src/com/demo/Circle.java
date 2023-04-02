package com.demo;

public class Circle implements printable, showable {

	int rad;

	public Circle() {

	}

	public Circle(int rad) {
		this.rad = rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public int getRad() {
		return rad;
	}

	public void print() {
		System.out.println("Drawing a circle");
	}

	@Override
	public void show() {
		System.out.println("Area of circle is :" + (2 * pi * rad));

	}

	public static void main(String argString[]) {

		printable p1 = new Circle();
		p1.print();

		showable s1 = new Circle(8);
		s1.show();

	}

}
