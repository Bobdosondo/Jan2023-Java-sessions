package accessmo1;

public class Animal {
	
	
	public void wildDog() {
		System.out.println("Wild dog is from the bush....");
	}
	
	private void domesticDog() {
		System.out.println("German shepherd is from the city....");
	}
	
	protected void eagle() {
		System.out.println("eagle is from the bush");
	}
	void chicken() {
		System.out.println("chicken is raised in the city");//default method
	}

	public static void main(String[] args) {
		
		
		Animal a = new Animal();
		a.chicken();
		a.domesticDog();
		a.eagle();
		a.wildDog();
	}

}
