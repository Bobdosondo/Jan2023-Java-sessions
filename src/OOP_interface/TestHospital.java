package OOP_interface;

public class TestHospital {

	public static void main(String[] args) {
		
		
		FortisHospital fh = new FortisHospital();
		fh.cardioService();
		fh.dentalService();
		fh.emergencyService();
		fh.physioService();
		fh.pediaService();
		fh.medicalClaim();
		fh.medicalTraining();
		fh.neurologyService();
		fh.oncologyService();
		fh.orthoService();
		fh.medicalRD();
		
		//top casting :child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.cardioService();
		us.dentalService();
		us.emergencyService();
		us.physioService();
		
		
		WHO wh=new FortisHospital();
		wh.covidVaccinationCamp();
		
		
		// down casting :NA
		//new USMedical();
	}

}
