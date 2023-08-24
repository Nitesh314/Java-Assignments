package com.masai.Bean;

public class Student {
	
	private int roll;
	private String name;
	private String address;
	private String mobile;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address, String mobile) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	

}
