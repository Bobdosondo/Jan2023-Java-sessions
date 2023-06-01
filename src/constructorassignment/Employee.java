package constructorassignment;

public class Employee {
	
	
//	Assignment 3:
//
//		Create a Java class named "Employee" with the following instance variables:
//
//		id (int)
//
//		name (String)
//
//		salary (double)
	
	private int id;
	private String name;
	private double salary;
	

//		Create a constructor for the Employee class that takes in the id, name, and salary as parameters and initializes the instance variables.
	
	
	
	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
//
//		Create getter methods for each of the instance variables.



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
//
//	Create a main method that creates an instance of the Employee class using the constructor, 
//  prints out the employee's information using the getter methods, and gives the employee a 10% raise using the setter method for the salary instance variable.
//    result in employeeTest class
	
	
//		Questions:
//
//		What is the purpose of a getter method in Java?
//      the purpose of a getter method  is to access or retrieve  private properties from one class to another one
//
//		Can a getter method return void?
	
	    
//
//		What is the access level of a getter method in Java?
//
//		What is the purpose of a setter method in Java?
//      setter method is used to update value in java
//
//		Can a setter method return a value other than void?
//


}
