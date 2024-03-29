package com.override;

public class SchoolStudent extends Student {

	private String schoolName;
	private int std;

	public SchoolStudent() {

	}

	SchoolStudent(int id, String name, float marks, double fees, String schoolName, int std) {
		super(id, name, fees, marks);
		this.schoolName = schoolName;
		this.std = std;

	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public void calcFees(double fees) {
		System.out.println("Calculating school fees");
		fees = (fees * 4) + 5000;
		setFees(fees);

	}

	public String toString() {
		return super.toString() + "  SchoolName:" + schoolName + "  Class:" + std;
	}

}
