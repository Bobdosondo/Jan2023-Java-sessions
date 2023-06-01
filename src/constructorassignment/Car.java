package constructorassignment;

public class Car {
	
	
	
//	Assignment 4:
//
//		Create a Java class named "Car" with the following instance variables:
//
//		make (String)
//
//		model (String)
//
//		year (int)
	
	String make;
	String model;
	int year;
//
//	Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	
	
	
//
//		Create a default constructor for the Car class that sets the make, model, and year to "Unknown".
	public Car() {
		String make;
		String model;
		int year;
	}
	
	
//
//		Create a main method that creates three instances of the Car class using both constructors and prints out their information.
	
	
	public static void main(String[] args) {
		
		Car c = new Car("Toyota", "Hylander", 2020);
		System.out.println(c.make+" "+c.model+" "+c.year);
		
		
		Car c1 = new Car();
	    System.out.println(c1.make +" "+ c1.model+" "+c1.year);
		
		
		
	}
//
//		Questions:
//
//		What is the purpose of a default constructor in Java?
//	    the purpose is to initialize the default values of the instance variables

//		Can a default constructor take in parameters
//	    No,the default constructor is know of having 0 parameter

//		Can a constructor be overloaded in Java? If so, what does it mean to overload a constructor?
//       Yes ,to overload a constructor mean to have many constructors with different parameter
	
	
//		Can you create an object of a Java class without calling a constructor?
//      No,when you create an object of a java class ,the default constructor will be called

//		How are instance variables accessed and modified outside of the class they are defined in?
//      the instance variables are access  with this keyword and  are modified with the set method outside in the instance of the class
}
