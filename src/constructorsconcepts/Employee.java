package constructorsconcepts;

public class Employee {
	
	
	String name;
	int age;
	double salary;
	
	
	//constructor
	//name is as same as class name
	// cannot have any return value/void
	//no return type
	//constructor will be called when you create the object 
	//constructor will be overload
	
	public Employee() {//0 param
		System.out.println("default constructor");
			
	}
	
	public Employee(int i) {//1 param
		System.out.println("1 param constructor"+ i);
		}
	
	public Employee(int i,String p) {//2 param
		System.out.println("2 param constructor"+" "+ i +" "+ p);
			
	}
		

	public static void main(String[] args) {
		
		
		Employee obj = new Employee();
		Employee obj1 = new Employee(10);
		Employee ob2 = new Employee(20,"Jack");
	}

}
