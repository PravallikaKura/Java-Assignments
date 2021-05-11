package pravallika.assignment.data;

interface Cycle{
	void balance();
}

class Unicycle implements Cycle{
	public void balance() {
		System.out.println("balance exists through single wheel");
	}
	
}

class Bicycle implements Cycle {
	public void balance() {
		System.out.println("balance exists through two wheels");
	}
	
	
}
class Tricycle implements Cycle{
	public void balance() {
		System.out.println("balance exists through two wheels sideways and one center ");
	}
	
}

interface CycleFactory{
	Cycle getCycle();
}

class UniFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}

class BiFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bicycle();
	}
}

class TriFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}


public class CycleFactoryDemo {

	public static void balancingCycle(CycleFactory atlasfactory){
		Cycle c = atlasfactory.getCycle();
		c.balance();
	}
	public static void main(String[] args) {
		balancingCycle(new UniFactory());
		balancingCycle(new BiFactory());
		balancingCycle(new TriFactory());
		
		
		
	}

}
