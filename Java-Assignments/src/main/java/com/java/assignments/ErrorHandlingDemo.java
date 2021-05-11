package com.java.assignments;

import java.util.Scanner;

class NotSufficientSpaceException extends Exception{
	   NotSufficientSpaceException(String warning){
	     System.out.println(warning);
	   }
	}
class ImproperDeclarationException extends Exception{
	ImproperDeclarationException (String warning){
		 System.out.println(warning);
	    }
	}
class NullValuesException extends Exception{
	NullValuesException(String warning){
	       System.out.println(warning);
     }
}

/** if(i==0)
            throw new MyException1("i==0");
        if(i<0)
            throw new MyException2("i<0");
        if(i>0)
            throw new MyException3("i>0");
    }
    public static void main(String[] args) {
        for(int i = -1; i < 2; i++){
            try{
            f(i);
        }catch(Exception e){
            System.err.print("Exception caught...");
            e.printStackTrace();
        }
        }
        
    }
**/ 
public class ErrorHandlingDemo {
	
	public static void errorDemo() throws  NotSufficientSpaceException, ImproperDeclarationException, NullValuesException {
	   
		Scanner sc = new Scanner(System.in); 
		int[] arr = new int[10];
		int size = sc.nextInt();
		if(size > 10)
			throw new NotSufficientSpaceException("Size is more than the the input ");
		if(size == -1 || size == 0)
			throw new NullValuesException("Negative or Null values is given in size ");
		if(size < 10)
			throw new ImproperDeclarationException("Less size than the required input 11");
		
		
	}

	public static void main(String[] args) {
		try {
			errorDemo();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("Finally clause executing successfully");
		}
	}

}
