package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		System.out.println(a+b);//30
		
		
		String x ="Quality automation";
		String y = "Testing engineer";
		System.out.println(x+y);
		System.out.println("x" + " y");
		System.out.println("x + y");
		System.out.println(x + y);
		
		System.out.println("----->");
		
		String x1="Hello";
		String x2="World";
		System.out.println(x1+x2);
		System.out.println(a+b+x1+x2);
		System.out.println(x1+x2+a+b);
		System.out.println(a+b+x1+x2+a+b);
		System.out.println(x1+x2+(a+b));
		
		System.out.println("----->");
		double d= 5.5;
		double d1=5;
		System.out.println(d+d1);
		System.out.println(x1+x2+d+d1);
		
		System.out.println("----->");
		
		char c='a';
		char c1='b';
		char c2='@';
		System.out.println(c);
		System.out.println(c+c1);
		System.out.println('a');
		System.out.println(c+a);
		System.out.println(c2);
		System.out.println(c+c2);
		System.out.println('@'+'a');
		
		System.out.println((byte)'a');
		System.out.println((int)'a');
		System.out.println((float)'a');
		
		
		
		System.out.println("----->");
		int p1=200;
		int p2=300;
		System.out.println("the value of p1 is:"+ p1);
		System.out.println("the value of p2 is:"+p2);
		System.out.println("the sum of p1 and p2 is:"+(p1+p2));
		
		
		
		//a-z:97 to 122
		//A-Z:65 to 90    ---->ASCII values range
		//0-9:48 to 57
		  
		System.out.println("----->");
		
		char k='1';
		char k1 ='5';
		System.out.println(k);
		System.out.println(k+k1);
		System.out.println((int)k);
		System.out.println((int)k1);
	}

}
