package com.java.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.apache.commons.*;

public class MapTextFileCountOccurence {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String filename = sc.next();
		
		 BufferedReader br = new BufferedReader(new FileReader(filename));
		 String s;
		 StringBuffer sb = new StringBuffer();
	      String str;
	      while((str = br.readLine())!= null){
	         sb.append(str);
	      }
	      s = sb.toString();
		 
		 
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i < ((CharSequence) s).length(); i++) {
			Character c = ((CharSequence) s).charAt(i);
			if(Character.isLetter(c)) {
				if(!(map.keySet().contains(c))) {
					map.put(c, 1);
				}
				else {
					int counter = map.get(c);
					map.put(c, ++counter);
				}
			}
		}
		System.out.println(map);
	}
}
