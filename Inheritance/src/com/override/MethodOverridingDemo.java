package com.override;

class Personnn {
	protected void display() {
		System.out.println("I am a person");
	}

}

class Employee extends Personn {

	public void display() {
		System.out.println("I am a employee");
	}

}

class Celebrity extends Personn {
	public void display() {
		System.out.println("I am a celebrity");
	}

}

public class MethodOverridingDemo {

	public static void main(String[] args) {

		Personnn p1 = new Personnn();
		p1.display();

		Employee e1 = new Employee();
		e1.display();

		Celebrity c1 = new Celebrity();
		c1.display();

	}

}
