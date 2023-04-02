package com.heirarchical;

public class Schoolstudent extends Student {

	private String sname;
	private int std;

	Schoolstudent() {

	}

	Schoolstudent(String name, int std) {

		this.sname = sname;
		this.std = std;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Schoolstudent [sname=" + sname + ", std=" + std + "]";
	}
}
