package javasessions;

public class Students {
	
	
	
	public int getStudentsMarks(String studentName) {
		System.out.println("Getting marks"+" " +studentName);
		
		
		int marks=-1;
		
		
		switch (studentName.toLowerCase()) {
		
		
		case "Bob":
			marks=99;
			break;
			
			
        case "Mike":
        	marks=75;
			 break;
			 
			 
        case "Rob":
        	marks=80;
	         break;
	         
	         
        case "Jake":
        	marks=60;
	         break;
     
		default:
			System.out.println("Students not found"+" "+studentName);
			break;
		}
		
		return marks;
		
	}

	public static void main(String[] args) {
		Students s = new Students();
		
		
		
		int s1=s.getStudentsMarks("Bob");
		System.out.println(s1);
		if(s1>=0) {
			System.out.println("Print mark sheet");
		}
		
		int s2=s.getStudentsMarks("Mike");
		System.out.println(s2);
		if(s2>=0) {
			System.out.println("Print mark sheet");
		}
		
		int s3=s.getStudentsMarks("Rob");
		System.out.println(s3);
		if(s3>=0) {
			System.out.println("Print mark sheet");
		}
		
		int s4=s.getStudentsMarks("tom");
		System.out.println(s4);
		if(s4>=0) {
			System.out.println("Print mark sheet");
			
		}
		
		
		
	}

}
