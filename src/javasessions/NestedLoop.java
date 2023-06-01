package javasessions;

public class NestedLoop {

	public static void main(String[] args) {
		
		//Nested loop:
		
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		//30 31 32 33 34
		    
		// Nested loop :
		//m*K;
		for(int m=0;m<=3;m++) {
			
			for(int n=0;n<=4;n++) {
				System.out.print(m+""+n +" ");
			}
			System.out.println();
			
		}
		
		//Time complexity of this:
		//(1+n+n+n)(1+n+n+n)=(3n+1)(3n+1)=9n^2+3n+3n+1
		//9n^2+6n+1=3(3n^2+2n)=3n(n+2)=3n(n)=3n^2
		//==>0(n^2)--->quadratic equation
		
		
		
		//cubic equation
		
//		000 001 002 003 004 
//		010 011 012 013 014 
//		020 021 022 023 024 
//		030 031 032 033 034 
//		040 041 042 043 044 
//		100 101 102 103 104 
//		110 111 112 113 114 
//		120 121 122 123 124 
//		130 131 132 133 134 
//		140 141 142 143 144 
//		200 201 202 203 204 
//		210 211 212 213 214 
//		220 221 222 223 224 
//		230 231 232 233 234 
//		240 241 242 243 244 
//		300 301 302 303 304 
//		310 311 312 313 314 
//		320 321 322 323 324 
//		330 331 332 333 334 
//		340 341 342 343 344 
		
for(int m=0;m<=3;m++) {
			
			for(int n=0;n<=4;n++) {
				
				for(int d=0;d<=4;d++) {
					System.out.print(m+""+n+""+d +" ");
					
				}
				System.out.println();
				
				
			}
			//time complexity of this
			//(1+3n)(1+3n)(1+3n)=9n^2+6n+1(1+3n)
			//==>9n^2+6n+1+27n^3+18n^2+3n
			//==>27n^3+27n^2+9n+1
			//==>9(3n^3+9n^2+n)=9n(3n^2+n+1)
			//==>9n(3n^2+n)=n(3n^2+n)=n^2(3n+1)
			//==>n^2(3n)=3n^3
			//==>0(n^3)--->cubic equation
			
			
		}
 for(byte i=1;i<=127;i++) {
	 System.out.println(i);
	 if(i==127) {
		 break;
	 }
	 
 }
 

	}

}
