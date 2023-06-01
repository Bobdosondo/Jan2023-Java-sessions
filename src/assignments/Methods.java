package assignments;

public class Methods {
	
//	1.Write a program to print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method
	
	
	public void calculate(int a, int b) {
		System.out.println(a+b);
		System.out.println(a/b);
		System.out.println(a-b);
		System.out.println(a*b);
		
	
		
	}

//	2. Define a method that returns the product of two double numbers entered by user.
	public double multiply(double a,double b) {
		double c=a*b;
		System.out.println("the value of c is :" + c);
		return c;
		
	}

//	________________________________
//
//	3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	
	//Area=π · r2
	//Circumference=2 * π * R
	
	public double print(int r) {
		double π=3.14;
		int radius=r;
		int radius1=r^2;
		double Area= π * radius1;
		double circumference=2*π*radius;
		System.out.println("the circumference of the circle is :"+circumference);
		System.out.println("The area of the circle is :"+Area);
		return r;
		
	}
	
	

//	________________________________
//
//	4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	
	//Max
	public void maxNumber(int a ,int b,int c) {
		
		if(a>b&& b>c) {
			System.out.println(" a is the greatest");
		}
		else if(b>a&&b>c) {
			System.out.println("b is the greatest");
		}
		else if(c>b&&c>a) {
			System.out.println("c is the greatest");
			
		}
		else {
			System.out.println("not the greatest");
		}
	}
	
	//Min
	public void minNumber(int a,int b,int c) {
		if(a<c&&c<b) {
			System.out.println("a is the minimum");
		}
		else if(b<a&&a<c) {
			System.out.println("b is the minimum");
			
			
		}
		else if(c<a&&a<b) {
			System.out.println("c is the mimimum");
			
		}
		else {
			System.out.println("not the greatest");
		}
		
	}
	
	
//________________________________
//	5. Def﻿ine a program to find out whether a given number is even or odd - return true/false.
	
	public void evenOrOddNumber(int a) {
		if(a%2==0) {
			System.out.println(a +" "+"is Even numver");
		}
		else {
			System.out.println(a +" "+"is Odd number");
		}
		
	}
//	________________________________
//	6. A person is eligible to vote if his/her age is greater than or equal to 18.
	
	public static void voteEligibility(int age) {
		if(age>=18) {
			System.out.println("He or her is eligible to vote");
		}
		else {
			System.out.println("not eligible");
		}
	}
//
//	 Define a method to find out if he/she is eligible to﻿ vote. - return true/false
//
//	_______________________________
//
//	7. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//	Marks        Grade
//
//	91-100         AA
//
//	81-90          AB
//
//	71-80          BB﻿
//
//	61-70          BC
//
//	51-60          CD
//
//	41-50          DD
//
//	<=40          Fail
//
//	________________________________
//
//	8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//
//	Factorial of any number n is represente﻿d by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//
//	4! = 1*2*3*4 = 24
//
//	3! = 3*2*1 = 6
//
//	2! = 2*1 = 2
//
//	Also,
//
//	1! = 1
//
//	0! = 0
//	
//	
//	
	public static void main(String[] args) {
		
		Methods m=new Methods();
		m.calculate(25, 5);
		double mult=m.multiply(5.5, 2);
		double cir =m.print(2);
		double ar=m.print(4);
		m.maxNumber(7, 5, 9);
		m.minNumber(5, 15, 2);
		m.evenOrOddNumber(6);
		Methods.voteEligibility(25);
		
	}

}
