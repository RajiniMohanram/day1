package com.proj.test;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;

import org.junit.Test;

import com.proj.model.Student;

public class TestNameValidator {


	@Test
	public void testStudentProperties() {
		Class cut = Student.class;
		Field[] fields = cut.getDeclaredFields();
		assertTrue(fields.length==3);
		assertTrue(fields[0].getName().equals("regNo"));
		assertTrue(fields[0].getType().equals(int.class));
		assertTrue(fields[1].getName().equals("name"));
		assertTrue(fields[1].getType().equals(String.class));
		assertTrue(fields[2].getName().equals("gpa"));
		assertTrue(fields[2].getType().equals(double.class));
		
	}
}
