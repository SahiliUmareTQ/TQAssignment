package com.advanced;

public class Cube implements Printablee {

	int side;

	Cube() {

	}

	Cube(int side) {
		this.side = side;
	}

	@Override
	public void area() {

		System.out.println("Area of cube is :" + (6 * side * side));

	}

	public void volume() {
		System.out.println("Volume of cube is :" + (side * side * side));
	}

	public static void main(String[] args) {

		Printablee p = new Cube(4);
		p.area();
		p.volume();
	}

}
