package com.pragmatic.test.task7;

public class Student {
	private String name;
	private int age;
	private String facultyNumber;
	private double grade;
	
	public Student() {

	}

	public Student(String name, int age, String facultyNumber, double grade) {
		this.name = name;
		this.age = age;
		this.facultyNumber = facultyNumber;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", facultyNumber=" + facultyNumber + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facultyNumber == null) ? 0 : facultyNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object otherStudent) {
		if (this == otherStudent) {
			return true;
		}
		
		if (otherStudent == null) {
			return false;
		}
		
		if (!(otherStudent instanceof Student)) {
			return false;
		}
		
		Student other = (Student) otherStudent;
		
		if (facultyNumber == null && other.getFacultyNumber() != null) {
				return false;
		} else if (!facultyNumber.equals(other.facultyNumber)) {
			return false;
		}
		
		return true;
	}
}
