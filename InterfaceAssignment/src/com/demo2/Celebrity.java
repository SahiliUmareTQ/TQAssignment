package com.demo2;

public class Celebrity implements Person {

	private int name;
	private float rating;

	public Celebrity() {

	}

	Celebrity(int name, float rating) {
		this.name = name;
		this.rating = rating;
	}

	// getter setter
	public void setName(int name) {
		this.name = name;
	}

	public int getName() {
		return name;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getRating() {
		return rating;
	}

	// toString

	public String toString() {
		return "Celebrity :" + name + " " + rating;
	}

	@Override
	public void showDetails() {

		System.out.println(name + " " + rating);

	}
}
