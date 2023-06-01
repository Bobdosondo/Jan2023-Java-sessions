package javasessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add("testing");
		ar.add('K');
		ar.add(true);
		//Never create any type of raw Array.
		
		
		for(Object e:ar) {
			System.out.println(e);
		}
	
		

	}

}
