package OOP_encapsulation;

public class EmployeeTest {
	
	

	public static void main(String[] args) {
		
		//POST-Create
		Employee e1 = new Employee("Ravi", 25, 30.75, "NYC", "USA");
		
		//GET-retrieve
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.getCity()+" "+e1.getCountry());
		
		//PUT-update
		e1.setAge(26);
		e1.setSalary(35.00);
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.getCity()+" "+e1.getCountry());
		
		
		
		
//		e1.setName("Ravi");
//		e1.setAge(25);
//		e1.setSalary(30.75);
//		e1.setCity("NYC");
//		e1.setCountry("USA");
//		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.getCity()+" "+e1.getCountry());
	}

}
