package com.java.assignments;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Student {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String engDepartment;
	private int yearofenrollment;
	private double perTillDate;
	
	public Student(int id, String name, int age, String gender, String engDepartment, int yearofenrollment,
			double perTillDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.engDepartment = engDepartment;
		this.yearofenrollment = yearofenrollment;
		this.perTillDate = perTillDate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getEngDepartment() {
		return engDepartment;
	}



	public void setEngDepartment(String engDepartment) {
		this.engDepartment = engDepartment;
	}



	public int getYearofenrollment() {
		return yearofenrollment;
	}



	public void setYearofenrollment(int yearofenrollment) {
		this.yearofenrollment = yearofenrollment;
	}



	public double getPerTillDate() {
		return perTillDate;
	}



	public void setPerTillDate(double perTillDate) {
		this.perTillDate = perTillDate;
	}

	

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
		studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
	    studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
	    studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
		studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
		studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
		studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
		studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
		studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
		studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
		studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
		studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
		studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
		studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
		studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
		studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electrical", 2019, 72.4));
		studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
		
		List<String> deptNames = 
			    studentList.stream()
			              .map(Student::getEngDepartment)
			              .collect(Collectors.toList());
		System.out.println("All Engineering Department Names " + deptNames);
		
		
		List<String> studentNames = new ArrayList<String>();
		
        for (Student s : studentList) {
            if (s.getYearofenrollment() > 2018) {
                studentNames.add(s.getName());
            }
        }
		
        System.out.println("Names of all students who have enrolled after 2018 " + studentNames);
        
        List<String> studentMaleCSEstudents = new ArrayList<String>();
        
        for (Student s : studentList) {
            if (s.getGender() == "Male" && s.getEngDepartment() == "Computer Science")
            	studentMaleCSEstudents.add(s.getName());
        }
	    
	   System.out.println("Male CSE Students " +studentMaleCSEstudents);  
	    Map<Object, Long> groupingStudents = studentList.stream()
	    		.collect(Collectors.groupingBy(s -> s.getGender(),Collectors.counting()));
	    
	    System.out.println("Students grouped by Gender " +groupingStudents);
	    
	    System.out.println("Average age by gender:");
	      Map<Object, Double> averageAgeByGender =
	    		  studentList
	              .stream()
	              .collect(
	                   Collectors.groupingBy(
	                       Student::getGender,                      
	                       Collectors.averagingInt(Student::getAge)));
	               
	      System.out.println("Group by Gender and Age  " +averageAgeByGender);
	      
	      
	      DoubleSummaryStatistics highestAchievingStudent = 
	    		  studentList
		          .stream()
		          .mapToDouble(Student::getPerTillDate)
		          .summaryStatistics();
	      
	      System.out.println("Highest Percentage in List : " + highestAchievingStudent.getMax());
	      System.out.println("Lowest Percentage  in List : " + highestAchievingStudent.getMin());
	      
	      
	      Map<Object, Long> studentsinEachepartment = studentList.stream()
		    		.collect(Collectors.groupingBy(s -> s.getEngDepartment(),Collectors.counting()));
	      System.out.println("Students groued by department " +studentsinEachepartment);
	      
	      Map<Object, Double> averagePercentageByDepartment =
	    		  studentList
	              .stream()
	              .collect(
	                   Collectors.groupingBy(
	                       Student::getEngDepartment,                      
	                       Collectors.averagingDouble(Student::getPerTillDate)));
	               
	      System.out.println("Group by Department and Percentage  " +averagePercentageByDepartment);
}
}
