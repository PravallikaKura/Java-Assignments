package com.java.assignments;
import java.util.regex.Pattern;

public class StringandType {

	public static void main(String[] args) {
		String s1 = "All is well!";
		String s2 = "Hello World!!";
		String s3 = "Tit for tat!!!";
		String s4 = "wolf Jack Hammer!!";
		
		String pattern = "^[A-Z](.*)!$";
		System.out.println(s1.matches(pattern));
		System.out.println(s2.matches(pattern));
		System.out.println(s3.matches(pattern));
		System.out.println(s4.matches(pattern));
		
	}

}
