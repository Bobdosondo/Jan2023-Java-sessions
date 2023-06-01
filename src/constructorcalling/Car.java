package constructorcalling;

public class Car {
	
	String name;
	int price;
	
	int min_speed=100;
	
	
	public void display() {
		System.out.println("Car display...");
	}
	
	public Car() {
		System.out.println("Car constructor...");
		
	}
	
	public Car(String name, int price) {
		System.out.println(name + " "+price);
		this.name = name;
		this.price = price;
	}
	
	
	

}
