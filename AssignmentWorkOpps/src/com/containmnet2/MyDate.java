package com.containmnet2;

public class MyDate {

	private String day;
	private int month;
	private int year;

	MyDate() {

	}

	MyDate(String day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDay() {
		return day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return " day " + day + " year " + year + " month " + month;
	}
}
