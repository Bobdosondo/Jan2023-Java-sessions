package assignments;

import java.util.Arrays;

public class CopyArrayFromAnotherArray {

	public static void main(String[] args) {
		
		
		//deleting static  Array element
		
		
		int p[]= {1,2,3,4,5};
		
		
		int q[]= new int[p.length-1];
		
		int ct=0;
		for(int e: p) {
			if(!(e==5)) {
				q[ct]=e;
				ct++;
			}
			
		}
      System.out.println(Arrays.toString(q));
      
      //copying a static array to a static array
      
      
      int a[]= new int[5];
      a[0]=5;
      a[1]=10;
      a[2]=15;
      a[3]=20;
      a[4]=25;
      
      int b[]=new int[a.length];
      
      
      int i=0;
      for(int j:a) {//go to a[] 1by1 
    	  b[i]=j;//and fill the value of b(b index is i)
    	  i++;
    	  
      }
System.out.println(Arrays.toString(b));

	}

}
