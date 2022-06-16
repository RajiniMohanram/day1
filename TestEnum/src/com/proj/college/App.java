package com.proj.college;

import java.util.Scanner;

import com.proj.college.model.Department;
import com.proj.college.model.Student;

/**
 * 
 * @author Rajini Mohanram
 *
 */
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student details");
		int regNo = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		double gpa = Double.parseDouble(sc.nextLine());
		Department dept = Department.valueOf(sc.nextLine());

		Student s = new Student(regNo, name, gpa, dept);
		s.display();

	}

}
