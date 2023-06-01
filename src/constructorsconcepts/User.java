package constructorsconcepts;

public class User {
	
	String fName;
	String lName;
	String emailId;
	String pWord;
	String phone;
	String city;
	int age;
	
	//Acceptance criteria;
	//user can be created if you have:
	
	//-->fName, lName;
	//-->fName, lName ,age;
	//-->fName, lName,emailId,pword;
	//-->fName, lName,emailId,pword,phone;
	//-->fName, lName,emailId,pword,phone ,city;
	
	public User(String fName, String lName) {
		
		this.fName = fName;
		this.lName = lName;
	}
	
	

	public User(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	
	
	}
	
	public User(String fName, String lName, String emailId, String pWord) {
		
		this.fName = fName;
		this.lName = lName;
		this.emailId = emailId;
		this.pWord = pWord;
	}
	

	public User(String fName, String lName, String emailId, String pWord, String phone) {
		
		this.fName = fName;
		this.lName = lName;
		this.emailId = emailId;
		this.pWord = pWord;
		this.phone = phone;
	}
	
	
	public User(String fName, String lName, String emailId, String pWord, String phone, String city, int age) {
		
		this.fName = fName;
		this.lName = lName;
		this.emailId = emailId;
		this.pWord = pWord;
		this.phone = phone;
		this.city = city;
		this.age = age;
	}



	public static void main(String[] args) {
		
		
		User u1 = new User("Bobdo", "Sondo");
		System.out.println(u1.fName+" "+u1.lName);
		
		User u2 = new User("Bobdo", "Sondo", 35);
		System.out.println(u2.fName+" "+u2.lName+" "+u2.age);
		
		User u3 = new User("Bobdo", "Sondo", "Bob18live@gmail.com", "Bob12345");
		System.out.println(u3.fName+" "+u3.lName+" "+u3.emailId+" "+u3.pWord);
		
		User u4 = new User("Bobdo", "Sondo", "Bob18live@gmail.com", "Bob12345", "805 495 2223");
		System.out.println(u4.fName+" "+u4.lName+" "+u4.emailId+" "+u4.pWord+" "+u4.phone);
		
		User u5 = new User("Bobdo", "Sondo", "Bob18live@gmail.com", "Bob12345", "805 495 2223","NYC",35);
		System.out.println(u5.fName+" "+u5.lName+" "+u5.emailId+" "+u5.pWord+" "+u5.phone+" "+u5.city+" "+u5.age);
		
		u5.city="Los Angeles";
		u5.phone="347 993 5963";
		System.out.println(u5.fName+" "+u5.lName+" "+u5.emailId+" "+u5.pWord+" "+u5.phone+" "+u5.city+" "+u5.age);
		
		
	}

}
