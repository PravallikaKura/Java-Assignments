package com.java.assignments;

public class RodentsDemo {

	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[3];
		rodents[0] = new Mouse();
		rodents[0].fetchFood();
		rodents[0].gnawFood();
		System.out.println();
		
		
		rodents[1] = new Gerbil();
		rodents[1].storeFood();
		System.out.println();
		
		
		rodents[2] = new Hamster();
		rodents[2].gnawFood();
		System.out.println();
		
	}

}
