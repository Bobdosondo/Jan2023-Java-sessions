package constructorcalling;

public class BMW extends Car{
	
	private int min_speed=200;
	
	
	public void speedCalculation() {
		System.out.println(min_speed);//BMW
		int carSpeed=super.min_speed;
		int diff = min_speed-carSpeed;
		System.out.println(diff);
	}
	@Override
	public void display() {
		System.out.println("BMW display...");
		super.display();
	}
	
	
	
	public BMW() {
		super("BMW x1", 40);//super-->parent class constructor
		System.out.println("BMW constructor ....");
		//super and this keyword  cannot be together/can't be called together
	}

	
}
