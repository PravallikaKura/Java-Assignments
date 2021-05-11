package com.java.assignments;

import java.util.Arrays;
public class ReferencesDemo {
	
	ReferencesDemo(String name){
		System.out.println(name);
	}
	
	public static void main(String[] args) {
	
		ReferencesDemo[] demos = new ReferencesDemo[10];
		for(int i = 0;i < 10;i++) {
			demos[i] = new ReferencesDemo("Pravallika");
		}
		
	}
	
}
