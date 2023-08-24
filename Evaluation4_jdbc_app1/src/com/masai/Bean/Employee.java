package com.masai.Bean;

public class Employee {
	
	private int empId;
	private String ename;
	private String address;
	private String mobile;
	private int salary;
	private int deptId;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String ename, String address, String mobile, int salary, int deptId) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.address = address;
		this.mobile = mobile;
		this.salary = salary;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", address=" + address + ", mobile=" + mobile
				+ ", salary=" + salary + ", deptId=" + deptId + "]";
	}
	
	
	

}
