package Inheritance;

public class Nexon extends Car {

	public static void main(String[] args) {
		
		Nexon nx = new Nexon();
		nx.breaks();
		nx.fourewheel();
		nx.fueltype();
		nx.machmethod(null);
		
		Car c = new Nexon();
		Vehicle c1 = new Car(); // dynamic Poly
		
	}
	
	public void start() {
		System.out.println("Engine is started by button type");
	}
	
	public void breaks() {
		System.out.println("Engine is started by nexon type");
	}
	
	public void machmethod() {
		System.out.println("I am mech method from Nexon class");
	}
	
	public void NexonnewEv() {
		System.out.println("I am mech method from Nexon class");
	}
	
	public void machmethod(String abc) {
		System.out.println("I am mech method from Nexon class");
		
	}

}
