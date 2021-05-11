package com.java.assignments;


class Outer{
	class Inner {
		Inner(String name){
			System.out.println("Inner class of first non default constructor " +name);
		}
	}
}

public class MultipleInnerClassesDemo {

	class MultipleInnerClassesDemoInner extends Outer.Inner{

		MultipleInnerClassesDemoInner(Outer outer, String name) {
			outer.super(name);
			System.out.println("Inner class of MultipleInnerClassesDemo which extends First Inner Class ");
		}
		
	}
	public static void main(String[] args) {
		MultipleInnerClassesDemo demo = new MultipleInnerClassesDemo();
		Outer demoouterclass = new Outer();
		MultipleInnerClassesDemoInner demoInner = demo.new MultipleInnerClassesDemoInner(demoouterclass, "Pravallika");
	}

}
