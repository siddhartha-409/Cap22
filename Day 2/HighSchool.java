package com.demo.inher;

class Person{
	
		
}
class Student extends Person{
	
}

class Teacher extends Person{
	
	double salary = 40000;
	String subject = "Java" ;
}

class CollegeStudent extends Student{
	
	int year = 2022;
	String major = "ECE";
}

public class HighSchool {
	
	public static void main(String args[]) {
		
		Teacher t = new Teacher();
		CollegeStudent ct = new CollegeStudent();
		System.out.println(t.salary);
		System.out.println(ct.major);
		
		
	}

}
