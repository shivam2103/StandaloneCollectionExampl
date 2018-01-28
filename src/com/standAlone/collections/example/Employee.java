package com.standAlone.collections.example;

import java.util.List;
import java.util.Map;

public class Employee {

	private int empId;
	
	private String empName;
	
	private Map<Integer,String> mulEmail;
	
	private List<String> gender;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mulEmail=" + mulEmail + ", gender=" + gender
				+ "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Map<Integer, String> getMulEmail() {
		return mulEmail;
	}

	public void setMulEmail(Map<Integer, String> mulEmail) {
		this.mulEmail = mulEmail;
	}

	public List<String> getGender() {
		return gender;
	}

	public void setGender(List<String> gender) {
		this.gender = gender;
	}
	
}
