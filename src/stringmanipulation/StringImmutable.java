package stringmanipulation;

public class StringImmutable {
	
	//meaning the value of String cannot be changed

	public static void main(String[] args) {
		
		String s = "Selenium";
		String t = s + "Hello";
		
		System.out.println(t);
		System.out.println(s);
		
		String st ="Java";
		System.out.println(st+"python");
		System.out.println(st);
		
		st = st + "Automation";
		System.out.println(st);//JavaAutomation
		
		String u = "Java";
		
		
		//mutable classes:
		//StringBuilder(jdk 1.5) and StringBuffer(jdk 1.0):

		StringBuilder sb = new StringBuilder("Testing");
		System.out.println(sb);
		sb.append("Automation");
		System.out.println(sb);
		
		String pop= "     submit     ";
		System.out.println(pop);
		pop=pop.trim();
		System.out.println(pop);
	
		//alaways use a StringBuilder when you want to do String manipulation
		// use the normal string when you dont wanna do any string manipulation
		
		
	}
	
	
	
	

}
