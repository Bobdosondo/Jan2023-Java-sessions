package javasessions;

import java.util.Arrays;

public class ArraysConcepts {

	public static void main(String[] args) {
		int a[] = new int[4];
		a[0] =10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
		System.out.println(a.length);
		
		
		System.out.println("----->");
		
		int len = a.length;
		System.out.println(len);
		
		//print all the element of the array:
		System.out.println(Arrays.toString(a));
		System.out.println(a[2]);
		
		System.out.println("------>");
		//printing all the element with a for loop:
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		
		
		System.out.println("------>");
		for(int i=0;i<len;i++) {
			System.out.println(a[i]);
		
	}
		
		System.out.println("------>");
		//String array:
		
		String s[] = new String[3];
		s[0] ="Bob";
		s[1] ="David";
		s[2] ="Max";
		System.out.println("total employee :" +s.length);
		//print with a for loop:
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			if(s[i].equals("Bob")){
			System.out.println("Bob salary is =" + 1000 ) ;
			}
		}
		
		System.out.println("------>");
		//print without looping
		System.out.println(Arrays.toString(s));
		
		
		
		
	}

}
