package com.java.assignments;

class Cycle{
	
}

class Unicycle extends Cycle{
	public void balance() {
		System.out.println("balance exists through single wheel");
	}
	
}

class Bicycle extends Cycle {
	public void balance() {
		System.out.println("balance exists through two wheels");
	}
	
	
}
class Tricycle extends Cycle{
	
	
}
public class CyclesDemo {

	public static void main(String[] args) {
	
		
		Unicycle myunicycle = new Unicycle();
		Bicycle mybicycle = new Bicycle();
		Tricycle mytricycle = new Tricycle();
		
		Cycle[] cycles = new Cycle[3];
		cycles[0] = myunicycle;
		//Here we are downcasting because balance method not available in base class
		((Unicycle) cycles[0]).balance();
		
		cycles[1] = mybicycle;
		//Here we are downcasting because balance method not available in base class

		((Bicycle) cycles[1]).balance();
		
		cycles[2] = mytricycle;
		//((Bicycle) cycles[2]).balance();
		//Since we dont have method of balance and it cant cast to bicyle we can't print balance and gives ClassCastException
		
		

	}

}
