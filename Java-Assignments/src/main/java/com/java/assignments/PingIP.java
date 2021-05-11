package com.java.assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PingIP {

  public static void PingHostIp(String command) {

		try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(p.getInputStream()));

			String s = "";
			int count = 0;
			
			//ArrayList to add ping times of host
			ArrayList<Double> timetakentoPing = new ArrayList<Double>();
			
			
			// Reading output stream of the command
			while ((s = inputStream.readLine()) != null && count <= 10) {
				System.out.println(s);
				
				if(s.indexOf("time=") == -1)
					timetakentoPing = timetakentoPing;
				else {
					int startIndex = s.indexOf("time=")+5;
					int endIndex = s.indexOf("ms");
					double s1 = Double.parseDouble(s.substring(startIndex, endIndex));
					timetakentoPing.add(s1);
				}
				count += 1;
			}
			
			timetakentoPing.sort(null);
			double mediantime = 0.0;
			int size = timetakentoPing.size();
			
			if(size % 2 == 0 && size != 0)
				mediantime = (timetakentoPing.get(size/2) + timetakentoPing.get((size)/2 + 1));
			else 
				mediantime = timetakentoPing.get(size/2);
			System.out.println("Median time in pinging host is " +mediantime);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		String ip = "google.com";
		PingHostIp("ping " + ip);

	
	}
}


