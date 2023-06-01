package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
		
		//ArrayList ar = new ArrayList();// vc=10,pc=0;by default
		ArrayList <Integer>ar = new ArrayList<Integer>(20);
		//vc =20,pc=0;
		//LF=20/2=10\
		
		ArrayList <Integer> numberList = new ArrayList<Integer>();
		//vc=10;pc=0;
		
		numberList.add(100);
		numberList.add(200);
		numberList.add(300);
		numberList.add(400);
		System.out.println(numberList.size());
		
		numberList.remove(2);
		System.out.println(numberList.get(2));
		System.out.println(numberList.size());
		System.out.println(numberList);
		System.out.println("----->");
		
		
		//Writing on the same line with Arrays.asList method
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom","Bob","Max","Nti"));
		System.out.println(empList.size());
		System.out.println(empList);
		empList.add("Lisa");//continuous memory allocation
		empList.add(0, "Shawn");
		System.out.println(empList);
		System.out.println("------->");
		
		
		
		
		//writing in the same line with List method.
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
		System.out.println(nums.size());
		System.out.println(nums);
		
		List<String>  pageList = Arrays.asList("LoginPage","HomePage","RegistrationPage","AddChartPage");
		System.out.println(pageList.size());
		System.out.println(pageList);
		System.out.println("----->");

		//Sorting a list with ArrayList
		List<Integer> NList=Arrays.asList(2,5,3,4,1,6);
		System.out.println(NList);
		Collections.sort(NList);
		System.out.println(NList);
		
		
		Collections.reverse(NList);
		System.out.println(NList);;
		System.out.println("----->");
		
		//Sorting with Static Array
		
		int test[] = {2,0,5,1,3,6,4};
        System.out.println(Arrays.toString(test));
		
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		
		ArrayList<String> MyList = new  ArrayList<String>(Collections.nCopies(5, "Bobdo"));
		System.out.println(MyList.size());
		System.out.println(MyList);
		
		
		
	}

}
