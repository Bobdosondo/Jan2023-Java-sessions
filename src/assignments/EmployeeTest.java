package assignments;

public class EmployeeTest {
	String name;
	int age;
	

	//create 3 static methods
	
	public static void t1() {
		System.out.println("t1 method");
		t2();//calling static --->static
		
	}
	
	
    public static void t2() {
    	System.out.println("t2 method");
    	
    	EmployeeTest.t3();//calling static --->static
	}
    
    
   
    public static void t3() {
    	System.out.println("t3 method");
    	
	
  }
    
	
	//create 3 non static method
    
    public void m1() {
    	System.out.println("m1 method");
    	m2();//calling non static--->non static
    }
	        
    public void m2() {
    	System.out.println("m2 method");

	m3();//calling non static--->non static
    	
    }
    public void m3() {
    	System.out.println("m3 method");
    	EmployeeTest.t1();//calling non static to static
    	
	
}
    
    public void getEmpInfo(EmployeeTest ep1) {
    	
    	ep1.name="Bob";
    	ep1.age=35;
    	System.out.println(name);
    	System.out.println(age);
    	
    	
    }
			
			
			
			

	public static void main(String[] args) {
		
		
		EmployeeTest ep = new EmployeeTest();
		
		ep.m1();//calling static to non static
		
		System.out.println(ep.name);
		System.out.println(ep.age);
		
		ep.getEmpInfo(ep);//calling by reference
		
		ep.name="Yuna";
		ep.age =30;
		System.out.println(ep.name);
		System.out.println(ep.age);
		
		ep.getEmpInfo(ep);
		
		
		

	}

}
