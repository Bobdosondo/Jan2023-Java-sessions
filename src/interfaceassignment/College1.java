package interfaceassignment;

public class College1 extends Education implements USUniversity, UKUniversity, IndiaUniversity{
	
    //US
	@Override
	public void science() {
		System.out.println("C1 ---USUniversity science");
		
		
	}

	@Override
	public void litterature() {
		System.out.println("C1 ---USUniversity litterature");
		
		
	}

	@Override
	public void math() {
		System.out.println("C1 ---USUniversity math");
		
		
	}
    //UK
	@Override
	public void art() {
		System.out.println("C1 ---UKUniversity art");
		
		
	}

	@Override
	public void linguistic() {
		System.out.println("C1 ---UKUniversity linguistic");
		
		
	}
    // India
	@Override
	public void health() {
		System.out.println("c1 ---IndiaUniversity health");
		
	}

	@Override
	public void computerScience() {
		System.out.println("C1 ---IndiaUniversity computerScience");
		
	}
   //Wes
	@Override
	public void giveDegreesEquivalency() {
		System.out.println("C1 ---giveDegreesEquivalency for Universities");
		
		
		
	}
	
	public static void sportDiscipline() {
		
	}
//	@Override
//	public void programmingSubject() {//override method from interface UK
//		 
//	 }

}
