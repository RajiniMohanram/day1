package com.proj.college.model;

public class Student {
	private int regNo;
	private String name;
	private double gpa;
	private Department dept;

	/**
	 * 
	 * @param regNo This is Student registration number
	 * @param name  Student name
	 * @param gpa   Student's GPA
	 * @param dept  Student's Department
	 * 
	 */
	public Student(int regNo, String name, double gpa, Department dept) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.gpa = gpa;
		this.dept = dept;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void display() {
		System.out.println("Student Reg. No: " + regNo);
		System.out.println("Name: " + name);
		System.out.println("GPA: " + gpa);
		System.out.println("Department: " + dept);
	}
}
