package pravallika.assignment.singleton;

public class PrintNonStaticVariables {

	
	String input;
	
	public static PrintNonStaticVariables initializeNonStatic(String s) {
		
    PrintNonStaticVariables variableObject = new PrintNonStaticVariables();
    //Here it's a static method and cannot make a static refernce to non static variables 
	//input = s;
	return variableObject;
		
	}
	
	public void printnonStaticVariable() {
		System.out.println(input);
	}
}
