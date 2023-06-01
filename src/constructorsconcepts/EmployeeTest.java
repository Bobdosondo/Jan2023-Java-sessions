package constructorsconcepts;

public class EmployeeTest {
	
	
	String name;
	int age;
	double salary;
	
	//hidden constructor/default constructor
	//constructor is used to initialize the global variables
	
	public EmployeeTest(String name) {
		this.name=name;
  //with the help of this keyword we can access global variables
 //	constructor is used to restrict unnecessary objects creation
		
	}
	
	public EmployeeTest(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public EmployeeTest(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	
	
	

	public static void main(String[] args) {
		
		EmployeeTest e1 = new EmployeeTest("Bob");
		//System.out.println(e1);not a god practice
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		
		EmployeeTest e2 = new EmployeeTest("Bob", 35);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);
		e2.salary=50.5;
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);
		
		
		EmployeeTest e3 = new EmployeeTest("Tom", 20, 25.5);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary);
	}

}
