package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
			
		}
		
		
		//while loop:
		
		
		
		int j =1;
		while(j<=100) {
			System.out.print(j);
			j=j+2;
			//13579111315171921232527293133353739414345474951535557596163656769717375777981838587899193959799
		}
		
		int k =1;
		while(true) {
			System.out.println("Welcome to New York");
			if(k==5) {
				break;
			}
			k++;
			
		}
		
//		int k =1;
//		while(true) {
//			k++;
		
//			System.out.println("Welcome to New York");
//			if(k==5) {
//				break;
//			}
//	}
			
		
		
		
//		int k =1;
//		while(true) {
//			System.out.println("Welcome to New York");
//		}--->infinite loop
		
		
		
//		int k =1;
//		while(true) {
//			System.out.println("Welcome to New York");
//			if(k==5) {
//				break;
//			}
//			
//			
//		}---->infinite loop
		
		
		
		
		
		//for loop:
		//print 1 to 10;
		//for(initialization;condition;increment or decrement)
		 
		
		for(int p=1;p<=10;p++) {
			System.out.println(p);
			
		}
		
//		int p=1;
//		for(;p<=10;) {
//			
//			System.out.println(p);
//			
//			p++;
//		}
		
		
		
		
		
//		for(int p=1;p<=10;) {
//			
//			System.out.println(p);
//			
//			p++;
//		
//		}
		
		
//		for( ; ; ) {
//			System.out.println("Welcome to Naveen automation labs");
//			
			//infinite loop
		//}
		
		
		
		
//		for( ; ; ) {
//			System.out.println("Welcome to Naveen automation labs");
//			break;
//		}
		
		
		
		
//		for( ;true; ) {
//			System.out.println("Welcome to Naveen automation labs");
//			 //infinite loop;
//		}
		
		
		
		
		int c = 1;
		for( ;true; ) {
			System.out.println("Welcome to Naveen automation labs");
			if(c==5) {
				break;
			}
			c++;
			
		}
		
		
		
		int f;
		for(f=1;f<=5;f++) {
			System.out.println(f);
			
		}
		
		
		
		System.out.println("-------->");
		
		//print a to z with ASCII values
		
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
		
		
		
		
       System.out.println("-------->");
		
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch +"=" +(byte)ch);
		}
		
		
		
		
		
		System.out.println("--------->");
	
	for(char bb='A';bb<='Z';bb++) {
		System.out.println(bb);
		
	}
	
	System.out.println("--------->");
	
	for(char bb='A';bb<='Z';bb++) {
		System.out.println(bb +"=" +(byte)bb);
		
	}
	
	
	System.out.println("--------->");
	
	int g =1;
	while(true) {
		System.out.println(g   + "= Naven");
		if(g==100) {
			break;
		}
		g++;
	}
	
	
	System.out.println("------>");
	 
	 for(int g1 =1;g1<=100;g1++) {
		 System.out.println(g1 +"= Naveen");
		 
	 }
	
	
	for(double d=1.1;d<=5.0;d++) {
		System.out.println(d);
	}
	
	
	for(int l = 1; l<=100;l++){
		
		if(l%2==0) {
			System.out.println(l);
			
			// printing even numbers
		}
		
	}
	
	for(int l =1; l<=100;l++) {
		if(l % 2!=0) {
			System.out.println(l);
			//printing odd numbers
		 }
			
	}
	
	//do-while loop
	
	
	int r =1;
	do {
		System.out.println(r);
		
		r++;
		//output from 1 to 10
	}
	while(r<=10);
	 
	
	int q=1;
	do {
		System.out.println(q);
		q++;
		//output=1
	}
	while(q>=10);
	
	
	
	}
}
