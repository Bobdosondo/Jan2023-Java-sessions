package exceptionhandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		
		System.out.println("Hi");
		
		try {
		int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...");
		}
		
		finally {
			
			System.out.println("Bye...finally block");
		}
		
		
	}

}
