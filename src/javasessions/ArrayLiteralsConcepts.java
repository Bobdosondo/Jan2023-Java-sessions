package javasessions;

import java.util.Arrays;

public class ArrayLiteralsConcepts {

	public static void main(String[] args) {
		
		
		int a[] = {10, 20, 30, 40, 50, 60, 70,};
		
       System.out.println(a.length);
       System.out.println(Arrays.toString(a));
       
       
       //vowels
       char c[]= {'a','e','i','o','u','y'};
       System.out.println(c.length);
       System.out.println(Arrays.toString(c));
       
       System.out.println("------>");
       
       for(char i=0;i<c.length;i++) {
    	   System.out.println(c[i]);
       }
       
       
       System.out.println("---->");
       
       String browsers[] = {"Chrome","Safari","Firefox","Edge","IE"};
       
       
  
    	   for(int i=0;i<browsers.length;i++) {
    		   
    		   System.out.println(browsers[i]);
    		   
       switch (browsers[i]) {
	case "Chrome":
		System.out.println("Chrome is from Google");
		break;
    case "Safari":
    	System.out.println("Safari is from Apple");
    	break;
    case "firefox":
    	System.out.println("Firefox is from Modzila");
	    break;
    case "Edge":
    	System.out.println("Edge is from Micrososoft");
	  break;
    case "IE":
    	System.out.println("IE is from Microsoft");
	    break;
	default:
		System.out.println("Please pass the right Browser");
		
		break;
	}
    	   }
    
        System.out.println("----->");
       
       
     //  Program using IfElse Statement:

  	   String bbrowsers[] = {"chrome","firefox","IE","Edge","Safari"};
   	   		
   	   		for(int k=0;k < bbrowsers.length;k++)
    	   		{
    	   			System.out.println();
   	   			System.out.println("The browser is"+" " + bbrowsers[k]);
   	   			
   	   			if(bbrowsers[k].equals("chrome")) {	
   	   				System.out.println("Browser Belongs to Google");
    	   			}
   	   			
   	   			
    	   			else if(bbrowsers[k].equals("firefox")){ 
   	   			   	   				System.out.println("Browser belongs to Mozilla"); 
   	   			   	   				}
   	   			
   	   			
    	   			else if(bbrowsers[k].equals("IE")) {
    	   				System.out.println("This is Deprecated");
    	   				System.out.println("Browser belongs to Microsoft");
    	   				
    	   			}
   	   			
    	   			else if(bbrowsers[k].equals("Edge")) {
    	   				System.out.println("Browser belongs to Microsoft");    	   				
    	   			}
   	   			
   	   			
    	   			else {
    	   			
    	   				System.out.println("The browser which comes in Else is"+bbrowsers[k]);
    	   				System.out.println("Browser belongs to Apple");
    	   				
    	   				
  	   			}
 	   		}       
       
   	   		
   	   		
	}

}
