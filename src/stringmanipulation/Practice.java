package stringmanipulation;

public class Practice {
	
	
	
	public static  String reverseString(String st) {
		
		String rev="";
		for(int i=st.length()-1;i>=0;i--) {
			rev= rev+st.charAt(i);
		}
		
		return rev;
		
	}

	public static void main(String[] args) {
		
		System.out.println(reverseString("Selenium"));
		
		
		
		StringBuilder sb = new StringBuilder("Selenium");
	
		System.out.println(sb.reverse());
		
		
		String s ="I will be a QA INGINEER";
		System.out.println(s.split(" ")[4]);
		
	}

}
