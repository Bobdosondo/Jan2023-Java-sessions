package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAssign {

	public static void main(String[] args) {
		
		
//		 1. Write a Java program to create a new array list,
//
//		                  --add some colors (string) 
//
//		                 ---and print out the colorslist.
		
		
		ArrayList<String> colorslist = new ArrayList<String>(Arrays.asList("Blue","Black","Red","Yellow","Orange"));
		System.out.println(colorslist.size());
		System.out.println(colorslist.get(1));
		System.out.println(colorslist);
		
		System.out.println("----->");
		colorslist.remove(0);
		System.out.println(colorslist);
		
//
//		                 
//
//		   2. Write a Java program to retrieve an element at a specified index from a given array list.
		
		System.out.println("------>");
		ArrayList<Integer> n = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(n);
		n.remove(1);
		System.out.println(n);
		
		
		//review
//		List<Integer> nums= Arrays.asList(5,10,20,20,25);
//		System.out.println(nums.size());
//		System.out.println(nums);
//		nums.remove(2)
//		System.out.println(nums);
		
//
//		                 
//
//		    3. Write a Java program to update specific array element by given element.
		
		System.out.println("------>");
		List<Integer> nums= Arrays.asList(5,10,20,20,25);
		System.out.println(nums);
		nums.set(2, 15);
		System.out.println(nums);
		
//
//
//		 4. Write a Java program to remove the third element from an array list. 
		
		System.out.println("------>");
		
		ArrayList<Integer> n1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(n1);
		n1.remove(2);
		System.out.println(n1);
		
		
//
//		 5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
		
		System.out.println("------>");
		ArrayList<Integer> n2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		for(int i=0;i<n2.size();i++) {
			if(i==3) {
				System.out.println(n2.get(i));
				break;
			}
			
		}
	
//
//		        
//
//		 6. Reverse this array List:
		
		System.out.println("----->");
//
		 ArrayList<String> studentNames = new ArrayList<String>();

		  studentNames.add("Varun");

		  studentNames.add("Reena");

		  studentNames.add("Naveen");

		  studentNames.add("Robin");

		  studentNames.add("Peter");
		  System.out.println(studentNames);
		  Collections.reverse(studentNames);
		  System.out.println(studentNames);
		  
		  
		  
//
//		 7. Write a Java program to extract a portion of an array list.
		  
		  System.out.println("----->");
		  
		  ArrayList<Integer> n3 = new ArrayList<Integer>(Arrays.asList(5,2,10,4,5));
		  for(int i=0;i<3;i++) {
			  System.out.println(n3.get(i));
		  }
		  
		  
//
//		 8. Write a Java program to empty an array list.
		  System.out.println("----->");
		  
		  ArrayList<Integer> n4 = new ArrayList<Integer>(Arrays.asList(5,2,10,4,5));
		  System.out.println(n4);
		  n4.clear();
		  System.out.println(n4);
//
//		 9. Write a Java program to trim the virtual capacity of an array list the current list size.
		  System.out.println("----->");
		  
		  ArrayList<Integer> n5 = new ArrayList<Integer>(4);
		  n5.add(0);
		  n5.add(1);
		  n5.add(2);
		  n5.add(3);
		  System.out.println(n5);
//
//		 10. Write a Java program to print all the elements of an ArrayList using the position of the elements
		  System.out.println("----->");
		  
		
		  List<String> names= Arrays.asList("Bob","max","Jack","Alex");
		  for(int i =0;i<names.size();i++) {
			  System.out.println(names.get(i));
		  }
	}

}
