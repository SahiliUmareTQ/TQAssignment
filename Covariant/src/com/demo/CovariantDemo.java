package com.demo;

//class
class Vehicle {

	protected int speed;
	{
		speed = 100;
	}

//method
	Vehicle changedSpeed() {
		speed = speed + 10;
		return this;
	}

	void display() {
		System.err.println("speed of vehicle:" + speed);
	}
}

//class
class car extends Vehicle {
	{
		speed = 200;
	}

//method
	Vehicle changedSpeed() {
		speed = speed + 50;
		return this;
	}

	void display() {
		System.err.println("speed of car:" + speed);
	}

	void changedGear() {
		System.out.println("Gear changed");
	}
}

public class CovariantDemo {

	public static void main(String[] args) {
		Vehicle v = new car();
		v.display();

		car c = new car();
		c.display();
		c = (car) c.changedSpeed();
		c.changedGear();
		c.display();
	}

}
