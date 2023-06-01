package stringmanipulation;

public class StringConcept {

	public static void main(String[] args) {
		
		//String literals:will be created inside 
		//the SCP(String constant pool)
		String s ="Hello";
		String s1 = "Hello";
		String s2 = "hello";
		System.out.println(s==s1);//compare the references
		System.out.println(s1==s2);//false
		
		//==boolean operator meaning left and right 
		//side are equal
		
		
		//String Objects with new keyword:
		String st = new String("Java");
		String st1 = new String("Hello");
		
		System.out.println(s==st1);//false
		System.out.println(s.equals(st1));
		//.equals always check the value
		
		String st2 = new String("Hello");
		
		String test = new String("Selenium");//1 object
		test.intern();//1 will create "Selenium" object in the SCP
		String t1 = "Selenium";
		System.out.println(t1);
		
		//right way of creating the String is the String literals
		
		String st4 = new String();
		System.out.println(st4.length());
	}

}
