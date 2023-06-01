package assignments;

public class IncrementAndDecrementsOperators {

	public static void main(String[] args) {
		
		
		
		
		
		
		
//		Incremental/Decremental Operators:
//
//			1) What will be the output of the following program?
//
//			public class IncrementDecrementQuiz 
//			{
//				public static void main(String[] args) 
//				{
//					int i = 11;
//					i = i++ + ++i;
//					System.out.println(i);
//				}
//			}
		
		/*int i = 11;// post increment:i =12
		i = i++ + ++i;
	    //   11  + (1+12)=24;
		System.out.println(i);
		
		*/
		
	
//
//         2) Guess the output of the following program?
//
//			public class IncrementDecrementQuiz 
//			{
//				public static void main(String[] args) 
//				{
//					int a=11, b=22, c;
//					
//					c = a + b + a++ + b++ + ++a + ++b;
//					
//					System.out.println("a="+a);
//					System.out.println("b="+b);
//					System.out.println("c="+c);
//				}
//			}
		
		
		/*int a =11; int b=22; int c;//a=13;b=24
		
		 c = a+b +  a++ + b++ + ++a + ++b;
		 //c=11+22 +11  + 22  + 13 + +24=103
		 System.out.println("a=" +a);
		 System.out.println("b=" +b);
		 System.out.println("c="+ c);
		 */
		 
//
//			3) What will be the output of the below program?
//
//			public class IncrementDecrementQuiz
//
//			{
//			    public static void main(String[] args)
//
//			    {
//			        int i=0;
//			        i = i++ - --i + ++i - i--;
//			        System.out.println(i);
//			    }
//
//			}
//
		 
		/* int i =0;//i=0
		 i = i++ - --i + ++i -i--;
		 //i=0   - 1    +  1  -1;
		 System.out.println(i);
		 */
		 
		
		
//			4) Is the below program written correctly?
//
//			public class IncrementDecrementQuiz
//
//			{
//			    public static void main(String[] args)
//
//			    {
//			        boolean b = true;
//			        b++;
//			        System.out.println(b);
//			    }
//
//			}
		
		// boolean b = true;
	//	 b++; --->boolean cannot be converted to int
		 
		 
		 
		 
//
//			5) What will be the output of the below program?
//
//			public class IncrementDecrementQuiz
//
//			{
//			    public static void main(String[] args)
//
//			    {
//			        int i=1, j=2, k=3;
//			        int m = i-- - j-- - k--;
//			        System.out.println("i="+i);
//
//			        System.out.println("j="+j);
//
//			        System.out.println("k="+k);
//
//			        System.out.println("m="+m);
//			    }
//			}
		
		/* int i=1;int j=2; int k=3;//i=0,j=1;k=2
		 
		 int m=i-- -j-- - k--;
		 //m=  1 -  2    -3=-4
		 
		 System.out.println("i=" + i);
		 System.out.println("j=" +j);
		 System.out.println("k=" + k);
		 System.out.println("m=" +m);
		 */
	
//
//			6) What will be the output of the following program?
//			public class IncrementDecrementQuiz
//			{
//			    public static void main(String[] args)
//
//			    {
//			        int a=1, b=2;
//			        System.out.println(--b - ++a + ++b - --a);
//
//			    }
//
//			}
		
		/*  int a =1;
		  int b=2;
		  System.out.println(--b - ++a + ++b - --a);
		                   //1   - 2   + 2   - 1=0
		  
			*/	  
	
		
//
//			7) What will be the value of i, j and k in the below program?
//
//			public class IncrementDecrementQuiz
//
//			{
//			    public static void main(String[] args)
//
//			    {
//
//			        int i=19, j=29, k;
//			        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
//			        System.out.println("i="+i);
//
//			        System.out.println("j="+j);
//
//			        System.out.println("k="+k);
//
//			    }
//
//			}
		
		  int i =19;int j=29;int k;//i=19;j=29
		  k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
		  //k=19  -18   + 28  - 29   + 18  - 29  + 19 - 28
		  System.out.println("i=" +i);
		  System.out.println("i= " +j);
		  System.out.println("k=" +k);
		  
//
//			8) What is wrong with the below program? Why it is showing compilation error?
//
//			public class IncrementDecrementQuiz
//			{
//			    public static void main(String[] args)
//
//			    {
//
//			        int i = 11;
//			        int j = --(i++);
		  // syntax error
//
//			    }
//
//			}
//
		  
		  
//			9) Guess the value of p in the below program?
//
//			public class IncrementDecrementQuiz
//
//			{
//			    public static void main(String[] args)
//
//			    {
//			        int m = 0, n = 0;
//			        int p = --m * --n * n-- * m--;
//			        System.out.println(p);
//			    }
//
//			}
		  
		 /* int m =0;//m=-2;
		  int n =0;//n= -2;
		  int p = --m * --n * n-- * m--;
		   // p = -1  * -1  * -1  * -1 =1
		  System.out.println("m=" +m);
		  System.out.println("n=" +n);
		  System.out.println("p="+p);
		  */
		  
		  
		  
//			10) What will be the output of the following program?
//
//			public class IncrementDecrementQuiz
//
//			{
//			    public static void main(String[] args)
//			    {
//			        int a=1;
//			        a = a++ + ++a * --a - a--;
//			        System.out.println(a);
//
//			    }
//
//			}
		  
		  /*int a =1;//a=1
		  a = a++ + ++a * --a - a--;
		  //a= 1  + 3    * 2   -  2 =5
		  System.out.println(a);
		  */
//
		  
		  
//			11) What will be the outcome of the below program?
//			public class IncrementDecrementQuiz
//			{
//
//			    public static void main(String[] args)
//
//			    {
//			        int a = 11++;
//			        System.out.println(a);
//			    }
//
//			}
		  
		 // int a = 11++;//invalid argument
		 // System.out.println(a);
		  
		 
		  
//			12) What will be the outcome of the below program?
//
//			public class JavaIncrementDecrementQuiz
//
//			{
//			    public static void main(String[] args)
//
//			    {
//
//			        int ch = 'A';
//			        System.out.println(ch++);
//
//			    }
//
//			}
		  
		 /* char ch ='A';
		  System.out.println(ch++);
		  output A but it is B in the memory because the ASCII value is 65 + 1=66
		  */
//
		  
		  
//			13) What will be the outcome of the below program?
//
//			public class JavaIncrementDecrementQuiz 
//
//			{
//			    public static void main(String[] args) 
//
//			    {
//			        char ch = 'A';
//
//			         
//
//			        System.out.println(++ch);
//
//			    }
//
//			}
		  /*output is B 1+65=66 
		   * so we print B directly
		   */
//
		  
		  
//			14) What will be the outcome of the below program?
//
//			public class JavaIncrementDecrementQuiz
//
//			{
//			    public static void main(String[] args)
//
//			    {
//			        double d = 1.5, D = 2.5;
//			        System.out.println(d++ + ++D);
//
//			    }
		  
		  
		  double d =1.5;//1.5*3.5
		  double D=2.5;
		  System.out.println(d++ + ++D);
		  //output 5.0 instead of 5.25
//
//			}


		
	}

}
