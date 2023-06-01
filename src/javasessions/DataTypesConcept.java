package javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {
		
		
		
		//1-primitive data types:8
		
		//1-a:boolean type-->true or false statement
		//size=~1byte
		boolean t =true;
		boolean s = false;
		System.out.println(t);
		System.out.println(s);
	
		
		//1-b:Numeric types:
		//-->char:
		//size=2bytes
		char c ='z';//a-z
		char c1 ='%';// any special character
		char c2 ='1';//0-9
		char c3 ='A';//A-Z
		System.out.println(c);
		System.out.println(c+c3);
		System.out.println(c1);
		
		//-->Integral types:
		//Integer:
		//-byte=size =1byte=8bits:
		//range:-128 to 127
		byte b = 10;
		byte b1 = -95;
		byte b2 =125;
		System.out.println(b+b2);
		
		//-short:
		//size=2bytes=16bits
		//range:-32768 to 32767-->-2^15to 2^15-1
		short s1 =5355;
		short s2 =-32304;
		short s3 = 0;//not recommended ;use byte instead.
		System.out.println(s2+s3);
		
		
		//int:
		//size=4bytes=32bits
		//range: -2147483648 to 2147483647-->-2^31 to 2^31-1
		int i = -10000000;
		int  i1 = 15000000;
		int i2 = 500;//not recommended;use short  instead for memory efficiency
        System.out.println(i2);
		
		//-long:
		//size=8bytes=64bits
		//range:-2^63 to 2^63-1=-9.22337204E18 to
		long m =90000000000L;
		long m1=1000000000;
		
		System.out.println(m);
		
	    //1-c floating-point types:
		//-float:
		//size=4bytes=32bits
		//range:after.up to 7digits
		float f0=1.33f;
		float f1=100.6234157f;
		float f2=(float)24;
		float f3=10;//consider 7.00
		float f4=(float)5.2;
		System.out.println(f0);
		System.out.println(f1+f3);
		System.out.println(f4);
		System.out.println(f3);
		
		
		//2-non primitive data types;
		//-->String,Class,Interface....
		
	}

}
