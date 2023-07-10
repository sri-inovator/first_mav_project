package com.fssa.srikannan.day19.solved;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStudentValidator {
	
@Test

	public void testValidate() {
		Student student = getStudent();
		Assertions.assertTrue(StudentValidator.validate(student));
	}
	
	
@Test

	public void testInvalidName() {
		Student student = getStudent();
		try {
			student.name = "a";
			StudentValidator.validate(student);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name cannot be empty or null",
					ex.getMessage());
			
		}
	}
	public Student getStudent() {
		Student student = new Student();
		student.name = "Apj";
		student.age = 20;
		student.roll = 1001;
		student.emailId = "apj@freshworks.com";
		return student;
	}
}