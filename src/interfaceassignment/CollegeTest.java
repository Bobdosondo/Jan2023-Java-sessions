package interfaceassignment;

public class CollegeTest {
	
	public static void main(String[] args) {
		College1 c1 = new College1();
		//US
		c1.science();
		c1.litterature();
		c1.math();
		//UK
		c1.art();
		c1.linguistic();
		//India
		c1.health();
		c1.computerScience();
		//WES
		c1.giveDegreesEquivalency();
		//Education
		c1.certifyDiplomas();
		College1.sportDiscipline();
	    c1.programmingSubject();
		
		College2 c2 = new College2();
		c2.giveDegreesEquivalency();
		c2.certifyDiplomas();
		
		
		
		//top casting; child class objects can be refered by parent interface reference variables
		USUniversity us=new College1();
		us.science();
		us.litterature();
		us.math();
		us.giveDegreesEquivalency();
		
		
		UKUniversity uk = new College2();
		uk.art();
		uk.linguistic();
		uk.giveDegreesEquivalency();
		uk.programmingSubject();
		
		
		IndiaUniversity iu= new College1();
		iu.computerScience();
		iu.health();
		iu.giveDegreesEquivalency();
	
	}

}
