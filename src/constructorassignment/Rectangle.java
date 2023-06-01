package constructorassignment;

public class Rectangle {

//	Assignment 2:
//
//		Create a Java class named "Rectangle" with the following instance variables:
//
//		length (double)
//
//		width (double)

	double length;
	double width;
//
//Create a default constructor for the Rectangle class that sets both the length and width to 0.0.

	public Rectangle() {
		double length;
		double with;
		
	}

//
//		Create a constructor for the Rectangle class that takes in the length and width as parameters
	// and initializes the instance variables.
	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;
	}
//
//		Create a method in the Rectangle class named "calculateArea" that returns the area of the rectangle (length * width).

	public double calculateArea(double length, double width) {
		double area = length * width;
		System.out.println("The area of the rectangle is :" + " " + area);
		return area;

	}
//
//		Create a main method that creates two instances of the Rectangle class using both constructors, 
	// calculates and prints out their respective areas(view in RectangleTest class)
//
//		Questions:
//
//		What is the purpose of a default constructor in Java?
//      The default constructor’s purpose is to initialize the objects with default values.

//
//		How can you differentiate between a default constructor and a constructor that takes in parameters?
//      the default constructor even if not created is invoked at the time of object creation.It is invoked implicitly.
//      the constructor that takes a parameter is invokes explicitly

//		What is the access level of a constructor in Java?
//	    The access levels in a program can be introduced by the concept of Access Modifiers.
//	    Access Modifier in a java program is used to specify the scope of a field, method, constructor, or even a class.
//	    We can hence change the access level of fields, constructors, methods, and class by applying the access modifier to it. There are 4 types
	
//	Access Modifier	Description
//	Public	The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, 
//	within the package, and even outside the package.
	
//	Private	The access level of a private modifier is only within the class, the modifier is mentioned in. 
//	It cannot be accessed from outside that class.
	
//	Protected	The access level of a protected modifier is within the package (it is mentioned in) and outside the package through child class.
//	If you do not make the child class, it cannot be accessed from outside the package.
	
//	Default	The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
//	If you do not specify any access level, it will be set to default.
//
//		Can a constructor be private? If so, why would you want to make a constructor private?
//      Yes, class can have a private constructor. It is needed as to disallow to access the constructor from other classes
//      and remain it accessible within defined class.It is also used to prevent object creation



//		Can a constructor call a method from another class?
//      it is not a good practice calling a method in the scope of the constructor
//

}
