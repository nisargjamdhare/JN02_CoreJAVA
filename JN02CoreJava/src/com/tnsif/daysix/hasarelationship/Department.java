package com.tnsif.daysix.hasarelationship;

public class Department {
	private int deptNo;
	private String deptName;
	private int noOfEmployees;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptNo, String deptName, int noOfEmployees) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.noOfEmployees = noOfEmployees;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", noOfEmployees=" + noOfEmployees + "]";
	}

}
