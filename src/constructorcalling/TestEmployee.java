package constructorcalling;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee("Tom");
		System.out.println(e.name +" "+ e.age +" "+e.city);
		
	}

}
