package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAssign {

	public static void main(String[] args) {
		
		
//Q1: WAP to delete a specific number from the given array.
//	int p[] = {1,4,5,2,3,22,31, 2}; 
//--Need to remove 22 from the p[] array.
//--output should be: [1, 4, 5, 2, 3, 31, 2]
		
		ArrayList<Integer> p= new ArrayList<Integer>();
		p.add(1);//0
		p.add(4);//1
		p.add(5);//2
		p.add(2);//3
		p.add(3);//4
		p.add(22);//5
		p.add(31);//6
		p.add(2);//7
		System.out.println("Original Array size: "+ p.size());
		System.out.println("Contents : "+ p);
		
		
		System.out.println("------->");
		
		p.remove(5);
		System.out.println("Actual size:"+ p.size());
		System.out.println("Actual Contents :"+ p);
		
		
		System.out.println("----->");

	
		
		
		
// Q2: Write a program to create a static Array, having following cricket data:
//
//       --name, age, team name, DOB, gender, Strike Rate
//
//       --Try to create multiple Object Arrays for different players 
//
//   --Try to print all the values of each player on the console
		
		
		ArrayList<Object> playerInfo = new ArrayList<Object>();
		playerInfo.add("Max");
		playerInfo.add(25);
		playerInfo.add("Chicago Bull");
		playerInfo.add("12/5/1998") ;
		playerInfo.add('M');
		playerInfo.add(7.5);
		System.out.println(playerInfo);
		
	
		System.out.println("---->");
		
		playerInfo.add("Brel");
		playerInfo.add(23);
		playerInfo.add("Chicago Bull");
		playerInfo.add("1/5/2000") ;
		playerInfo.add('M');
		playerInfo.add(8.5);
		System.out.println(playerInfo);
		
		System.out.println("---->");
		
	ArrayList<Object> infoPlayer = new ArrayList<Object>(Arrays.asList("Jacob",25,"NYC Cosmos","4/7/2003",'M',7.00));
	System.out.println(infoPlayer);
	
	System.out.println("---->");
    List<Object>	Info = Arrays.asList("Drogba",42,"Cote D'ivoire",3/5/1981,'M',9.2);
    System.out.println(Info);

		

		

		
		

		
	}

}
