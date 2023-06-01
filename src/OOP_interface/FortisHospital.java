package OOP_interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndiaMedical, WHO {

	
	//US
	
	@Override
	public void physioService() {
		System.out.println("FH  ---physioService");
		
		
	}

	@Override
	public void dentalService() {
		System.out.println("FH ---dentalService");
		
		
	}

	@Override
	public void cardioService() {
		System.out.println("FH ---cardioService");
		
		
	}

	
	//UK
	
	@Override
	public void neurologyService() {
		System.out.println("FH ---neurologyService");
		
		
	}

	@Override
	public void pediaService() {
		System.out.println("FH ---pediaService");
		
		
	}
	
	
	
   //India
	
	@Override
	public void oncologyService() {
		System.out.println("FH ---oncologyService");
		
		
	}

	@Override
	public void orthoService() {
		System.out.println("FH ---orthoService");
		
		
	}
	
    // common method in parents interface
	@Override
	public void emergencyService() {	
		
		
	}
	
	//individual method for Fortis
	public void medicalTraining() {
		System.out.println("Fh ---medicalTraining");
		
	}
	
public void medicalClaim() {
	System.out.println("FH--medicalClaim");
		
	}


//WHO
@Override
public void covidVaccinationCamp() {
	System.out.println("FH --covidVaccinationCamp");
	
	
}


}
