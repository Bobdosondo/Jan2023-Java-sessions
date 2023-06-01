package accessmodifier1;

public class Car {

	
	public String name;
	protected int price;
	private int mileage;
	String brand;//default variable
	
	
	public static void main(String[] args) {
		 Car c = new Car();
		 c.name= "camry";
		 c.brand="toyota";
		 c.mileage=25000;
		 c.price=10000;
	}
}
