package com.java.assignments;

public class ConstructorDemo {
	
	String name;
	int rollnumber;
	double salary;

	ConstructorDemo(String nameOfapplicant, int rollNumber){
		this(10000.00);
		name = nameOfapplicant;
		rollnumber = rollNumber;
		
		
	}

	ConstructorDemo(double salaryOfApplicant){
		salary = salaryOfApplicant;
	}
	
	public static void main(String[] args) {
		ConstructorDemo demo1 = new ConstructorDemo("Pravallika", 525);
		System.out.println(demo1.name);
		System.out.println(demo1.rollnumber);
		System.out.println(demo1.salary);
	}
	
}
