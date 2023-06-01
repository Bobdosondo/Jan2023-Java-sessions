package constructorcalling;

public class Employee {
	String name;
	int age;
	String city;
	 
	public Employee() {
		this("Ravi", 20);
		System.out.println("Hi employee");
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}


	public Employee(String name) {
		
		//we can call only one constructor at the time inside of a constructor
		this();//current class constructor
		//this("Naveen", 50, "NYC");
		this.name = "Elola";
		this.age = 30;
		this.city = "Jacksonville";
		
	}
	
	

}
