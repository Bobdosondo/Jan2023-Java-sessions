package assignments;

public class ConditionalStatements {

	public static void main(String[] args) {
//		If-else and Switch-Case:
		//
//			Conditional Operators:
		//
//			Find out the greatest number out 
//			of three different given numbers:
		//
//		    Input the 1st number: 25 
		//
//			Input the 2nd number: 78 
		//
//			Input the 3rd number: 87
		//
//			Expected Output :
		//
//			The greatest﻿: 87
		//

				
				
				
		int a = 25;
		int b = 78;
		int c =87;
		
		 if(a>b && a>c) {
			 System.out.println("a is the greatest"); 
		 }
		 else if(b>c) {
			 System.out.println( "b is the greatest");
			 
		
		 }
		 else{
			 System.out.println("c is the greatest");
		 }
		 
		 
		// 
		// 2. Write a Java program to test a number is positive or negative.
		//
		// Test Data
		//
		// Input number: 35 -- positive number
		//
		// Input number: -11 -- negative number
		//

		 
		  byte num = -11;
		 
		 if(num >= 0) {
			 System.out.println(num +" is positive number");
		 }
		 else {
			 System.out.println(num +" is negative number");
			 
		 }
			 
		 
		 //3.WAP to check number is odd or even using If - Else
		 
		 int division = 5;
		 if(division % 2==0) {
			 System.out.println(division + " is odd number");
			 
		 }
		 else {
			 System.out.println(division + " is even number");
		 }
		 
		 
		 
		 //4.WAP to check given alphabet character is Vowel 
		 //or Consonant using Switch - Case
		 //vowel:a,e i,u,o,y
		 
		 String alphabet="e";
		 
		 switch (alphabet) {
		 
		case "e":
			
		case "a":
			;
		case "o":
			
		case "u":
			
		case "y":
			
		case "i":
			System.out.println(alphabet + " is a vowel");
			break;
		
		default:
			System.out.println(alphabet + " is a consonant");
			break;
		}
		 
		 
		// Check the given char is vowel or consonant using if-else
		 
		 char t='p';
		 if(t=='a'||t=='e'||t=='i'||t=='u'||t=='o'||t=='y') {
			 System.out.println(t + " is a vowel");
		 }
		 else {
			 System.out.println(t +  " is a consonant");
		 }
		 
		 
		 
		 


		 // 5.WAP to run your test cases in a specific environment like 
		 //QA,Stage,Dev,UAT,PRod using Switch-case
		 
		 String testEnvironment ="Bob";
		 
		 switch (testEnvironment.toLowerCase().trim()) {
		 
		case "QA":
			System.out.println("this is only for QA");
			
			break;
		case "Stage":
			System.out.println("this is only for Stage");
			
			break;
		case "Dev":
			System.out.println("this is only for Dev");
			
			break;
		case "UAT":
			System.out.println("this is only for UAT");
			
			break;
		case "Prod":
			System.out.println("this is only for Prod");
			
			break;

		default:
			System.out.println("please enter the right environment");
			
			break;
			
		}
		 
		 //WAP to book the specific type of car from 
		 //the Uber app using Switch - Case.
		 
		 String cars ="passat";
		 
		 switch (cars) {

		 
		case "Mini":
			System.out.println("This is a Mini");
			
			break;
			
		case "Sedan":
			System.out.println("This is a Sedan");
			
			break;
			
		case "SUV":
			System.out.println("This is a SUV");
			
			break;
			
		case "Premium":
			System.out.println("This is a Premium");
			
			break;




		default:
			System.out.println("Please select the right type of car");
			break;
		}
		 
		 //WAP to launch browsers using If-ElseIf and Switch Case.
		 //Browser: Chrome/Firefox/IE/Safari
		 
		 String browser ="Safari";
		 
		 switch (browser) {
	
		 
		 case "chrome":
			 System.out.println("Launch chrome");
			 
			
			break;
		 case "IE":
			 System.out.println("Launch IE");
			   
			 
			 break;
			
         
	       
		  default:
			  System.out.println("Please pass the right browser");
			break;
		}
		 if(browser.equals("Firefox")) {
			 System.out.println("Launch Firefox");
			 
		 }
		 else if(browser.equals("Safari")) {
			 System.out.println("Launch safari");
			 
		 }
	}

}
