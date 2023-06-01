package javasessions;

public class Car {
	
	String name;
	String color;
	int price;
	static final int wheels=4;
	

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name="BMW";
		c1.color="white";
		c1.price=80;
		System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+Car.wheels);
		
		Car c2 = new Car();
		c2.name="Honda";
		c2.color="Red";
		c2.price=70;
		System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+Car.wheels);
		
		
		Car c3 = new Car();
		c3.name="Audi";
		c3.color="Black";
		c3.price=40;
		System.out.println(c3.name+" "+c3.color+" "+c3.price+" "+Car.wheels);
		
		
		
	}

}
