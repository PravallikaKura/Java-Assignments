package com.java.assignments;

import java.util.Scanner;

public class CaseSensitivityCheck {

	public static void main(String[] args) {
		
		//Give input string
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input string");
		String originalString = sc.next();
		String input = originalString;
		
		//To remove case sensitivity of a string
		input = input.toLowerCase();
		
		int[] alphabets = new int[26];
		int index,sum = 0;
		
		
		
		for(int i = 0;i < input.length();i++) {
			index = ((int)(input.charAt(i)) - 97);
			if(alphabets[index] == 0)
				alphabets[index] += 1;
		}
		
		for(int i = 0;i < 26;i++) {
			sum += alphabets[i];
		}
		
		if(sum == 26)
			System.out.println("Input String contains all the a-z characters " +originalString);
		else
			System.out.println("Input String does not contain all the a-z characters " +originalString);

	}

}
