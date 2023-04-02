package com.advanced;

public interface Printablee {

	float pi = 3.147f;

	public void area();

	default void volume() {
		System.out.println("volume method");
	}

	static void show() {
		System.out.println("printablee interface method");
	}

	// common method for all non abstract method
	private void display() {
		System.out.println("made by me");
	}
}
