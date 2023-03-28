package com.accessspecifire;

public class ClassB extends ClassA {

	public static void main(String[] args) {

		ClassA A = new ClassA();
		A.dipaly1(); // public
		A.dipaly2(); // protected
		A.dipaly3(); // default

	}

}
