package stringmanipulation;

import exceptionhandling.MyException;

public class StringReverse {
	
	//Selenium --->muineles
	//A --->A
	
	
	
	public static String reverseString(String st) {
		if(st==null) {
			System.out.println("null value cannot be reverse...please pass the right value");
			throw new MyException("NULL VALUES");
		}
		
		if(st.length()==1) {
			
			return st;
			
		}
		else if(st.length()==0) {
			System.out.println("please pass the right value not the blank value");
			//return st
			//return "-1
		}
		
		String rev = "";
		for(int i=st.length()-1;i>=0;i--) {
			rev = rev + st.charAt(i);//muineleS
			
		}
		//System.out.println(rev);
		return rev;
		
		
		
		
	}
	// null=represent nothing
	//blank is a blank value;value of blank is zero
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("A"));
		System.out.println(reverseString("AA"));
		System.out.println(reverseString("Selenium testing java lang"));
		//System.out.println(reverseString(null));
		System.out.println(reverseString(""));
		System.out.println(reverseString("Selenium"));
		
		
	
StringBuilder sb = new StringBuilder("java python selenium"	);

		System.out.println(sb.reverse());
		
		

	}

}
