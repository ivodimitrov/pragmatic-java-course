package com.pragmatic.test.task7;

import java.util.Comparator;

public class StudentsGradeComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getGrade() < student2.getGrade()) {
			return 1;
		} else if (student1.getGrade() > student2.getGrade()) {
			return -1;
		}
		
		return 0;
	}
}