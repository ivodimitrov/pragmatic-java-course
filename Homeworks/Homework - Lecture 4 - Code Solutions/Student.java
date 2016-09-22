package hw04;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollage;
	int age;
	boolean isDegree;
	double money;
	
	Student() {
		grade = 4;
		yearInCollage = 1;
		isDegree = false;
		money = 0;
	}
	
	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear() {
		if(isDegree) {
			System.out.println("The student has graduated");
			return;
		}
		
		if(yearInCollage == 4) {
			isDegree = true;
		}

		yearInCollage++;
	}
	
	double receiveScholarship(double min, double amount) {
		if(grade > min && age < 30) {
			money += amount;
		}
		return money;
	}
}
