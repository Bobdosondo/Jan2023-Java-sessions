package javasessions;

public class EmployeeTest {
	
	String name;
	int age;
	
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void printMsg() {
		System.out.println("hello");
	}
	
	public void getEmpInfo(EmployeeTest ob) {
		
		ob.name="Bob";
		ob.age=35;
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		EmployeeTest obj= new EmployeeTest();
		obj.add(20, 30);//calling by value/argument
		obj.printMsg();//calling a method
		obj.getEmpInfo(obj);//call by reference
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.name="Angel";
		obj.age=25;
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.getEmpInfo(obj);
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		

	}

}
