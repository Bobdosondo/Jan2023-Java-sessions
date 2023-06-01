package constructorassignment;

public class Person {
	
	//Assignment 1:

//		Create a Java class named "Person" with the following instance variables:
//
//		name (String)
//
//		age (int)
//
//		gender (char)
//
//		height (double)
	
	
	String name;
	int age;
	char gender;
	double height;
	
	

//	Create a constructor for the Person class that takes in the name, age, gender, 
	//and height as parameters and initializes the instance variables.

	public Person(String name, int age, char gender, double height) {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}



public Person(String name, int age) {
	
	this.name = name;
	this.age = age;
}
	
	
//		Create a main method that creates two instances of the Person class using the constructor 
//      and prints out their information(view in class PersonTest).


//		Questions:
//
//		What is the purpose of a constructor in Java?
//      response:constructor constructs the class.The constructor is used to initialize the class objects.It limits the unnecessary objects creation


//		How does a constructor differ from a regular method in Java?
//      Response:Constructor name has to be same as the class.It has no return type.
//      It doesn't return anything(value).It is called at the time of object creation


//		Can a Java class have multiple constructors? If so, how are they differentiated?
//      Response:Yes a java class can have multiple constructors.We can differentiate them by overloading the constructors
//      Example:Constructor with zero parameter (default constructor) and constructor with multiple parameters

//		What happens if a constructor is not defined in a Java class?
//      Response:If constructor is not define,the compiler  will generate the default constructor once the object of the class is created


//		Can a constructor call other methods or constructors within the same class?
//      Response:Yes ,with the help of this keyword


	
	
	
	
}
