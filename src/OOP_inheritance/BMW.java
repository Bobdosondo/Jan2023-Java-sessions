package OOP_inheritance;

public class BMW extends Car{
	
	//BMW is extending car class
	//BMW is child class of car class
	//Car is the parent class of BMW
	//Car is the super class of BMW
	//BMW is the subclass of car class
	
	@Override
	public void start() {
		System.out.println("BMW ---start");
	}
		
		
		//Method Overriding :runtime polymorphism or dynamic polymorphism
		// when you have a method in parent class and the same 
		//method in child class
		//with the same name
		//with the same number of parameters and sequence
		//with the same return
	@Override	
	public void petrolEngine() {
		System.out.println(" BMW ---petrolEnfine");
	}
	
	
	public void autoParking() {
		System.out.println("BMW ---auto parking");
	}

	public void theftSafety() {
		System.out.println("BMW ---theftSafety");
		
	}
}
