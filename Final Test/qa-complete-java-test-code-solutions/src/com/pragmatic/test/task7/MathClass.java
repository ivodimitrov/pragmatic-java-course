package com.pragmatic.test.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MathClass {
	private List<Student> students;

	public MathClass() {
		students = new ArrayList<Student>();
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public Student findByFacultyNumber(String facultyNumber) {
		if (facultyNumber == null || facultyNumber.trim().equals("")) {
			return null;
		}
		
		for (Student student: students) {
			if (student.getFacultyNumber().equals(facultyNumber)) {
				return student;
			}
		}
		
		return null;
	}
	
	public Student findStudentsMinGrade() {
		double minGrade = students.get(0).getGrade();
		Student minGradeStudent = students.get(0);
		for (Student student : students) {
			if (student.getGrade() < minGrade) {
				minGradeStudent = student;
			}
		}
		
		return minGradeStudent;
	}
	
	public void printStudentsByGradeDesc() {
		Collections.sort(students, new StudentsGradeComparator());
		for (Student student: students) {
			System.out.println(student.getName() + " : " + student.getGrade());
		}
	}
	
	public void deleteStudent(Student student) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student mathStudent = iterator.next();
			if (mathStudent.equals(student)) {
				iterator.remove();
			}
		}
	}
}
