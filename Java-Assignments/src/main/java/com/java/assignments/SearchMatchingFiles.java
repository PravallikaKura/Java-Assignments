package com.java.assignments;

import java.io.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.SystemUtils;

class FindFiles {
	public void printFiles(String pattern) {
		String homeDirectory = "/home/pravk";
		File[] listOfFiles = new File(homeDirectory).listFiles();
		printFilesByPath(listOfFiles,pattern);
	}
	
	public void printFilesByPath(File[] listOfFiles, String pattern) {
		if(listOfFiles == null)
			return;
		for(File file : listOfFiles) {
			if(file.isDirectory()) {
				File[] list = file.listFiles();
				printFilesByPath(list, pattern);
			} else {
				Pattern patternTobeMatched = Pattern.compile(pattern);
				Matcher matcher = patternTobeMatched.matcher(file.getName());
				if(matcher.matches())
					System.out.println("File Found " + file.getAbsolutePath());
			}
		}
	}
	
	
}

public class SearchMatchingFiles {
	public static void main(String args[]) throws Exception {

		FindFiles findFilesMatched = new FindFiles();
		Scanner sc = new Scanner(System.in);
		String prompt;
		String pattern = "^[a-zA-Z](.*).txt$";
		
		while(true) {
			System.out.println("Enter pattern to seach home directory ");
			prompt= sc.nextLine();
			if(prompt.equalsIgnoreCase("Exit"))
				break;
			findFilesMatched.printFiles(pattern);
		}
		
			
			
		}
	}

