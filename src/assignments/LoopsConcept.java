package assignments;

public class LoopsConcept {

	public static void main(String[] args) {
		
//		1. WAP to print following output: 
//
//			I am Batman﻿
//
//			I am Batman﻿
//
//			I am Batman﻿
//
//			I am Batman
//
//			I am Batman
//		
		
		int a=1;
		while(true) {
			System.out.println( " I am Batman");
			if(a==5) {
				break;
			}
			a++;
		}
		
		System.out.println("---->");
		
//		2. WAP to print following output:
//
//			I am Batman 1
//
//			I am Batman 2
//
//			I am Batman 3
//
//			I am Batman 4
//
//			I am Batman 5
//
//			I am Batman 6
//
//			I am Batman 7
//
//			I am Batman 8
//
//			I am Batman 9


		
		
		
		for(int i=1;i<10;i++) {
			System.out.println("I am Batman " +i);
		}
		
		//3. WAP to print 10 to 1 using for, while and do-while loop

      //1.for loop:
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		System.out.println("------>");
		//2.while looo:
		byte b=10;
		while(true) {
			System.out.println(b);
			if(b==1) {
				break;
			}
			b--;
		}
		System.out.println("------>");
		
		//3.do while
		byte c=10;
		do {
			System.out.println(c);
			c--;
			
		}
		while(c>=1);
		
		
		
		System.out.println("---->");
		
		//4. Write a program in Java to print "Hello World" ten times using while loop
         byte k=1;
        while(true) {
        	System.out.println(k+"."+"Hello World");
        	if(k==10) {
        		break;
        	}
        	k++;
        }
        
        System.out.println("----->");
        
   // 5. Write a program in Java to print all the multiplication of 5 from 1 to 100 
        //using while /for/do-while loop

      //1.for loop:
        for(int i=1;i<=100;i++) {
        	if(i%5==0) {
        		System.out.println(i);
        	}
        }
        
        
        System.out.println("----->");
      //2.while loop;
        
      int f=1;
      while(f<=100) {
    	  
    	  if(f%5==0) {
    		  System.out.println(f);	  
    	  }
    	  f++;
      }
      
      
      System.out.println("------->");
      
      
      //do while
      
      int g=1;
      
      do {
    	  if(g%5==0) {
    	
    		  System.out.println(g);
    		  
    	  }
    	  g++;
      }
        while(g<=100);
      
      System.out.println("------>");
      
     /// 6. print all odd and even numbers between 1 to 100
      
      //even numbers
      
      for(int i=1;i<=100;i++) {
    	  if(i%2==0) {
    		  System.out.println(i);
    	  }
      }
      
      System.out.println("------>");
      //odd numbers
      for(int i=1;i<=100;i++) {
    	  if(i%2!=0) {
    		  System.out.println(i);
    	  }
      }
      
      
      System.out.println("------>");
      
      
//      7. What will be the output of this program:
//
//    	  int i = 1;
//
//    	  while(i<=1){
//
//    	  System.out.println("Hi Java");
//    	  
//	  }
    	  //infinite loop
    	  // a break statement will end the loop after the print

    	
    	  
    	
    	  
    	  
    	//  8. Print A-Z , a-z, 0-9 with  the respective 
    	//ASCII numbers the console one using while and for loop.


      for(char ch='A';c<='Z';ch++) {
    	  System.out.println(ch +"="+(byte)ch);
    	  if(ch=='Z') {
    		  break;
    		  
    	  }
    	  	  
      }
      
      System.out.println("------->");
      for(char ch='a';c<='z';ch++) {
    	  System.out.println(ch +"="+(byte)ch);
    	  if(ch=='z') {
    		  break;
    	  }
    	  
      }	
      
      
      System.out.println("------->");
      for(char ch='0';c<='9';ch++) {
    	  System.out.println(ch +"="+(byte)ch);
    	  if(ch=='9') {
    		  break;
    	  }
    	  
      }	
      System.out.println("------->");
//      9. Print the following series: 
//
//      1.0 2.0 3.0  ...... 10.0 
      
      for(double d=1.0;d<=10.0;d++) {
    	  System.out.println(d);
      }
        System.out.println("------->");
//      0 9 18 27 36 …99
        
        for(int i=0;i<=99;i=i+9) {
        	System.out.println(i);
        }

        System.out.println("------->");
      
//      10.Print only vowels (aeiou) using for and while loop.
//      Start the loop from ‘a‘ to ‘z‘.
        
        for(char th='a';th<='z';th++) {
        	
        	
        	if(th=='a') {
        		System.out.println(th);
        	}
        	else if(th=='e') {
        		System.out.println(th);
        		
        	}
        	
        	else if(th=='i') {
        		System.out.println(th);
        		
        	}
        	else if(th=='o') {
        		System.out.println(th);
        		
        	}
        	else if(th=='u') {
        		System.out.println(th);
        		
        	}
        	else {
        		System.out.println("not vowel");
        		break;
        	}
        	
        }
        
      
        
        
        System.out.println("------->");
//
//    11.  Print 1 to 10 and break the loop once you find the multiplication 
//      of 7 with a message "bye, see you tomorrow".
      for(k=1;k<=10;k++) {
    	  System.out.println(k);
    	  if(k%7==0) {
    		  System.out.println("see you tomorrow");
    		  break;
    	  }
      
      }
      
      
      
      
      
	}
	

}
