package assignments;

import java.util.ArrayList;

public class ConceptWitSwitchStatement {
	// WAF:
	// supply input param: Company Name (String): IBM, MS, Google
	// return : the list of employee of the comp: ArrayList<String>

	public ArrayList<String> getEmpList(String compName) {
		
		System.out.println("Company name is :"+ " "+ compName);
		
		
		ArrayList<String> emplist= new ArrayList<String>();
		
		switch (compName.toLowerCase().trim()) {
		
	  case "Apple":
		    emplist.add("Ali");
			emplist.add("Joby");
			emplist.add("Ray");
			emplist.add("Bob");
			break;
			
			
      case "Google":
    	    emplist.add("Edgar");
			emplist.add("Davis");
			emplist.add("Eve");
			break;
			
			
      case "Amazon":
    	    emplist.add("Grace");
			emplist.add("Boby");
			emplist.add("Amy");
			emplist.add("Dray");
			emplist.add("Mickael");
	        break;
	        
	        
      case "Bob's Discount Fourniture":
    	    emplist.add("Ely");
			emplist.add("Anna");
	        break;
	        
	        
      case "H&M":
    	    emplist.add("Oumar");
			emplist.add("Mike");
			emplist.add("Angel");
			emplist.add("Ingrid");
	       break;

		default:
			System.out.println("Not found...please enter the right company name"+ " "+compName);
			break;
		}
		
		return emplist;
		
		
	}




	public static void main(String[] args) {
		
		ConceptWitSwitchStatement con = new ConceptWitSwitchStatement();
		
		ArrayList<String> applelist=con.getEmpList("Apple");
		System.out.println(applelist);
		System.out.println(applelist);
		
		System.out.println("--------------->");
		
		ArrayList<String> googlelist = con.getEmpList("Google");
		System.out.println(googlelist.size());
		System.out.println(googlelist);
		
		System.out.println("--------------->");
		
		
		ArrayList<String> amazonlist = con.getEmpList("Amazon");
		System.out.println(amazonlist.size());
		System.out.println(amazonlist);
		
		System.out.println("--------------->");
		
		ArrayList<String> BobsDiscountFourniturelist = con.getEmpList("Bob's Discount Fourniture");
		System.out.println(BobsDiscountFourniturelist.size());
		System.out.println(BobsDiscountFourniturelist);
		
		System.out.println("--------------->");
		
		ArrayList<String> HMlist = con.getEmpList("H&M");
		System.out.println(HMlist.size());
		System.out.println(HMlist);
		
		

}
}