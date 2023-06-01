package javasessions;

public class Shopping {
	
	//method overloading concept:
	//happen in the same class ;
	//1.same name of method;
	//2.different parameter;
	//3.different numbers of parameter;
	//4.different order of parameter;
	//5.return type does'nt matter
	
	
	public void test() {
		System.out.println("test method");
		
	}
	
	public void test(int a) {
		System.out.println("test method");
		
	}
	
	public void test(int a, int b) {
		System.out.println("test method");
		
	}
	
	public void test(int b,String a) {
		System.out.println("test method");
		
		
	}
	public void test(int a ,int b,int c) {
		System.out.println("test method");
		
	}
	
	
	public int test(double d) {
		System.out.println("test method");
		return 100;
	}
	

	public static void main(String[] args) {
		
		Shopping s = new Shopping();
		
		
		

	}

}
