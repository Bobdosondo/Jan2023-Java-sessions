package constructorassignment;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Amy", 25);
		System.out.println(emp.getId()+" "+ emp.getName()+" "+emp.getSalary());
		emp.setName("Yuna");
		System.out.println(emp.getId()+" "+ emp.getName()+" "+emp.getSalary());
		
		//raise
		emp.setSalary(25+(25*0.1));
		System.out.println(emp.getId()+" "+ emp.getName()+" "+emp.getSalary());
		
	}

}
