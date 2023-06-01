package javasessions;

public class MethodsInJava {
	
	
	public void test() {
		
		System.out.println("Test method");
	}
	
	
	
	public int totalAmount() {
		System.out.println("the total amount.....");
		int i=10;
		int tax=5;
		int finalPay=i+tax;
		return finalPay;
	}
	
	public int add(int a, int b) {
		System.out.println("adding 2 numbers");
		int sum=a+b;
		return sum;
		
	}
	
	
	

	public static void main(String[] args) {
		
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		int total=obj.totalAmount();
		int val=obj.add(10, 20);
		System.out.println(val);
		int s =obj.add(50, 100);
		System.out.println(s);
		System.out.println(s-10);
	}

}
