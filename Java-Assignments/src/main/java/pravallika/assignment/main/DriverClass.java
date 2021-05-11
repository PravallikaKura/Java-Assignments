package pravallika.assignment.main;

import pravallika.assignment.data.PrintVariables;
import pravallika.assignment.singleton.PrintNonStaticVariables;

public class DriverClass {

	public static void main(String[] args) {
		
		
		PrintVariables firstclass = new PrintVariables();
		//firstclass.printLocalVariables();
		firstclass.printNonStaticVariables();
		
		PrintNonStaticVariables secondclass = new PrintNonStaticVariables();
		secondclass.initializeNonStatic("Pravallika");
		secondclass.printnonStaticVariable();

	}

}
