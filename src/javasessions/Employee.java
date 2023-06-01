package javasessions;

public class Employee {
	//class variables=instance variables=data member=global variables
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		//local variables
		
		//String name ="Bobdo";
		//class--template/blueprint of the object/category of the object
		//object is the physical entity
		
		//object of the class:new keyword;
		
		Employee emp = new Employee();
		
		//emp = object reference name;object = new employee()
		//type =Employee
		
		
		//in term of variable
		//emp = variable name;Employee is the variable type
		//emp =object reference variable;
		
		 emp.name="Bobdo";
		 emp.age=35;
		 emp.city="NYC";
		 System.out.println(emp.name +" "+ emp.age+" "+ emp.city);
		 
		 
		 Employee emp1=new Employee();
		 System.out.println(emp1.name);
		 System.out.println(emp1.age);
		 System.out.println(emp1.city);
		 
		 new Employee().name="pter";
		 new Employee();
		 //No reference object--not .
		 
		 //never create the object without any reference name;
	}

}
