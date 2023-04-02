package com.advanced;

public class Square implements Printablee {

	int side;

	Square() {

	}

	Square(int side) {
		this.side = side;
	}

	@Override
	public void area() {

		System.out.println("Area of square is :" + (side * side));

	}

	public static void main(String[] args) {

		Printablee p1 = new Square(5);
		p1.area();
		p1.volume();

	}

}
