package com.proj.college;

import com.proj.college.employee.Employee;
import com.proj.college.employee.HOD;
import com.proj.college.employee.Lecturer;

public class App {

	public static void main(String[] args) {
		Lecturer logan = new Lecturer(2001, "Logan", 34000, "Mechanical");
		HOD charles = new HOD(3001, "Prof. Charles", 45000, "Civil");
		
		handle(logan);
		handle(charles);
	}

	public static void handle(Employee e) {
		e.info();
	}
}
