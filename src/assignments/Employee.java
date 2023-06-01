package assignments;

public class Employee {
	
	String name;
	int age;
	boolean empStatus;
	double salary;
	char EmpGender;
	String empSection;
	static final String companyName="Apple";
	String companyUrl;
	int EmpId;
	static final char companyLogo='A';//apple
	
	
	
	

	public static void main(String[] args) {
		
		Employee a1 = new Employee();
		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(a1.empStatus);
		System.out.println(a1.salary);
		System.out.println(a1.EmpGender);
		System.out.println(a1.empSection);
		System.out.println(a1.companyUrl);
		System.out.println(a1.EmpId);
		
		System.out.println("-------->");
		a1.name="Bob";
		a1.age=35;
		a1.empStatus=true;//actif
		a1.salary=25.5;
		a1.EmpGender='M';
		a1.empSection="QA";
		a1.companyUrl="www.apple.com";
		a1.EmpId=22;
		System.out.println(a1.name+" "+a1.age+" "+a1.empStatus+" "+a1.salary+" "+a1.EmpGender+" "
		+a1.empSection+" "+a1.companyUrl+" "+a1.EmpId+" "+Employee.companyName+" "+Employee.companyLogo);
		
		
		
		Employee a2 = new Employee();
		a2.name="Mike";
		a2.age=30;
		a2.empStatus=true;//actif
		a2.salary=20.5;
		a2.EmpGender='M';
		a2.empSection="DEV";
		a2.companyUrl="www.apple.com";
		a2.EmpId=27;
		System.out.println(a2.name+" "+a2.age+" "+a2.empStatus+" "+a2.salary+" "+a2.EmpGender+" "
		+a2.empSection+" "+a2.companyUrl+" "+a2.EmpId+" "+Employee.companyName+" "+Employee.companyLogo);
		
		
		
		Employee a3 = new Employee();
		a3.name="Gabi";
		a3.age=25;
		a3.empStatus=false;//actif
		a3.salary=0.0;
		a3.EmpGender='F';
		a3.empSection="CustoService";
		a3.companyUrl="www.apple.com";
		a3.EmpId=35;
		System.out.println(a3.name+" "+a3.age+" "+a3.empStatus+" "+a3.salary+" "+a3.EmpGender+" "
		+a3.empSection+" "+a3.companyUrl+" "+a3.EmpId+" "+Employee.companyName+" "+Employee.companyLogo);
		
		
		
		
		
		
		
		
	}

}
