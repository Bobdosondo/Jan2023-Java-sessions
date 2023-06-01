package javasessions;

public class User {
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {
		
		 User u1 = new User();
		 u1.name="Bob";
		 u1.age=35;
		 u1.city="NYC";
		
		 
		 User u2 = new User();
		 u2.name="Mike";
		 u2.age=27;
		 u2.city="LA";
		
		 
		 
		 User u3 = new User();
		 u3.name="Robin";
		 u3.age=15;
		 u3.city="DC";
	

		System.out.println(u1.name+" "+ u1.age+" "+u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+u3.city);
		//Bob
		//Mike
		//Robin
		
		System.out.println("---->");
		
		u1=u2;
		System.out.println(u1.name+" "+ u1.age+" "+u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+u3.city);
		        //Mike
				//Mike
				//Robin
		System.out.println("---->");
		
		u2=u3;
		System.out.println(u1.name+" "+ u1.age+" "+u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+u3.city);
		
		//Mike
		//Robin
		//Robin
		System.out.println("---->");
		
		u3 =u1;
		System.out.println(u1.name+" "+ u1.age+" "+u1.city);
		System.out.println(u2.name+" "+ u2.age+" "+u2.city);
		System.out.println(u3.name+" "+ u3.age+" "+u3.city);
		
		//Mike
		//Robin
		//Mike
		
		
		
	}
	
	

}
