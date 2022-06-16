package com.proj.college.employee;

public class Lecturer extends Employee{
	private String dept;

	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lecturer(int empId, String name, double salary, String dept) {
		super(empId, name, salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void info() {
		super.display();
		System.out.println("Department: "+dept);
	}

	
	
	
}
