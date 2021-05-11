package com.java.assignments;

import java.io.File;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.SystemUtils;


public class SearchMatchingFiles {
	
	public ArrayList<String> isMatched(String path) {
		
		ArrayList<String> tokens = new ArrayList<String>();
		String pattern = "/home*";
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(pattern);
		while (m.find()) {
			tokens.add(m.group());
		}
		
		return tokens;
	}
	public static void main(String args[]) throws Exception {

			File userDir = SystemUtils.getUserDir();
			System.out.println("User Directory: " + userDir.getCanonicalPath());

			File userHome = SystemUtils.getUserHome();
			System.out.println("User Home: " + userHome.getCanonicalPath());
			
			
			
			
			
		}
	}

