package pravallika.assignment.data;

public class PrintVariables {

	int num;
	char alphabet;
	
	public void printNonStaticVariables() {
		System.out.println("Number " +num);
		System.out.println("Character " +alphabet);
	}
	
	public void printLocalVariables() {
		int localnum;
		char localalphabet;
		
		//Java by default initializes non static variables with default values of data types but for local variables in methods it will not initialize so we will get compilation error.
		
		//System.out.println("Localnumber "+localnum);
		//System.out.println("Localcharacter " +localalphabet);
		
		
	}
}
