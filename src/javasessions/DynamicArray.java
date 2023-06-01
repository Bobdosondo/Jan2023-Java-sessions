package javasessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		//Raw type 
		
	ArrayList al = new ArrayList();
	
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	al.add(500);
	System.out.println(al.size());
	System.out.println(al.get(0));
	
	al.add("Test");
	al.add('K');
	al.add(12.3);
	al.add(true);
	
	System.out.println(al.size());
	
	System.out.println("------>");
	
	
	
	//Genetics in ArrrayList;
	ArrayList<Integer> marklist =new ArrayList<Integer>();
	marklist.add(10);
	marklist.add(20);
	marklist.add(30);
	System.out.println(marklist.size());
	for(int i=0;i<marklist.size();i++) {
		System.out.println(marklist.get(i));
	}
	
	System.out.println("----->");
	ArrayList<String> studentsName =new ArrayList<String>();
	studentsName.add("Tom");
	studentsName.add("Bob");
	studentsName.add("Sam");
	System.out.println(studentsName.size());
	System.out.println(studentsName);
	
	
System.out.println("------>");
	ArrayList<Character> charac =new ArrayList<Character>();
	
	charac.add('M');
	charac.add('F');
	
	for(Character e: charac) {
		System.out.println(e);
	}
	
		
		System.out.println("---->");
		System.out.println(charac);
	
	
	
	}

}
