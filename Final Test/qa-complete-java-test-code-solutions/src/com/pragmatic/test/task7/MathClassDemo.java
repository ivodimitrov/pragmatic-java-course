package com.pragmatic.test.task7;

public class MathClassDemo {
	public static void main(String[] args) {
		Student ivan = new Student("Ivan Ivanov", 22, "123", 4.85);
		Student peter = new Student("Peter Petrov", 21, "144", 4.45);
		Student maria = new Student("Maria Georgieva", 20, "232", 5.89);
		Student venelin = new Student("Venelin Petkov", 23, "432", 5.00);
		
		MathClass mathClass = new MathClass();
		mathClass.addStudent(ivan);
		mathClass.addStudent(peter);
		mathClass.addStudent(maria);
		mathClass.addStudent(venelin);
		
		System.out.println("Class size: " + mathClass.getStudents().size());
		
		Student foundStudent = mathClass.findByFacultyNumber("232");
		System.out.println(foundStudent);
		
		Student minGradeStudent = mathClass.findStudentsMinGrade();
		System.out.println(minGradeStudent.getName() + " has lowest grade of " 
				+ minGradeStudent.getGrade());
		
		mathClass.printStudentsByGradeDesc();
		
		mathClass.deleteStudent(new Student(null, 0, "144", 0));
		
		System.out.println("Class size: " + mathClass.getStudents().size());
 	}
}
