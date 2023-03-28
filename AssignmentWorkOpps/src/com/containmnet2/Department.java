package com.containmnet2;

public class Department {

	private int deptid;
	private String deptname;

	Department() {

	}

	Department(int deptid, String deptname) {
		this.deptid = deptid;
		this.deptname = deptname;
	}

	public void setDeptId(int deptid) {
		this.deptid = deptid;
	}

	public int getDeptId() {
		return deptid;
	}

	public void setDeptNmae(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptName() {
		return deptname;
	}

	public String toString() {
		return " deptid : " + deptid + " deptname : " + deptname;
	}
}
