package com.proj.model;

public class Student {
	private int regNo;
	private String studName;
	private double gpa;
	
	public Student(int regNo, String studName, double gpa) {
		super();
		this.regNo = regNo;
		this.studName = studName;
		this.gpa = gpa;
	}

	public void display() {
		System.out.println("Reg. No: "+regNo);
		System.out.println("Name: "+studName);
		System.out.println("GPA: "+gpa);
	}
}
