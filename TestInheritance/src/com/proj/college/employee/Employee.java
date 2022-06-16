package com.proj.college.employee;

public abstract class Employee {
	private int empId;
	private String name;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public abstract void info();
	
	public void display() {
		System.out.println("=== "+getClass().getSimpleName()+" ===");
		System.out.println("Employee Id: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}
