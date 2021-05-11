package com.java.assignments;

interface Animal{
	
	void run();
	void makesSound();
	
}

interface FlyingBird {
	
	void fly();
	void chirp();
}

interface Plant {
	void makesFood();
	void takeso2();
}

interface Livingbeing extends Animal, FlyingBird, Plant{
	void takesbreathe();
}

class Organism {
	void takesBirth() {};
}

class OrganismDemo extends Organism implements Livingbeing{

	public void run() {
		// TODO Auto-generated method stub
		
	}

	public void makesSound() {
		// TODO Auto-generated method stub
		
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}

	public void chirp() {
		// TODO Auto-generated method stub
		
	}

	public void makesFood() {
		// TODO Auto-generated method stub
		
	}

	public void takeso2() {
		// TODO Auto-generated method stub
		
	}

	public void takesbreathe() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfacesDemo {

	public static void animalRuns(Animal cat) {
		cat.run();
	}
	
	public static void birdChirp(FlyingBird parrot) {
		parrot.chirp();
	}
	
	public static void plantMakesFood(Plant rosePlant) {
		rosePlant.makesFood();
	}
	
	public static void OrganismLifeCycle(Organism bacteria) {
		bacteria.takesBirth();
	}
	
	public static void main(String[] args) {
		
		OrganismDemo microorganism = new OrganismDemo();
		animalRuns(microorganism);
		birdChirp(microorganism);
		plantMakesFood(microorganism);
		OrganismLifeCycle(microorganism);

	}
	
}
