package assignments;

public class User {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		
		
		User u1 = new User();
		u1.name = "bob";
		u1.age = 35;
		u1.city ="NYC";
		
		
		
		User u2 = new User();
		u2.name = "Mike";
		u2.age = 30;
		u2.city ="LA";
		
				
	    User u3 = new User();
		u3.name = "Sam";
		u3.age = 26;
		u3.city ="Albany";
		
				
		User u4 = new User();
		u4.name = "Tyema";
		u4.age = 40;
		u4.city ="Kingstone";
		
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		
		System.out.println("----->");
		
		u1=u2;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		//Mike
		//Mike
		//Sam
		//Tyema
		System.out.println("------>");
		
		u2=u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		//Mike
		//Sam
		//Sam
		//Tyema
		
		System.out.println("----->");
		u3=u4;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		//Mike
		//Sam
		//Tyema
		//Tyema
		System.out.println("------>");
		u4=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		//Mike
		//Sam
		//Tyema
		//Mike
		
		
	}

}
