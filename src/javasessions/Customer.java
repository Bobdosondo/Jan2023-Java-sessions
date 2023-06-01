package javasessions;

public class Customer {
	
	
	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String DOB;

	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.gender);//null character value for default value
		System.out.println(c1.isActive);
		System.out.println(c1.DOB);
		
		
		new Customer();//no object reference
		Customer c3 =new Customer();
		c3=null;//null reference object
		
		
		//call garbage collector
		System.gc();//but will not give the  guaranty the gc will be activated
		//It actually depend to the jvm
		//jvm will take care of the heap memory automatically

	}

}
