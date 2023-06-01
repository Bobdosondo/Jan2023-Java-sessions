package assignments;

import java.util.ArrayList;

public class ConceptWithIfElseStatement {
	
	// WAF:
		// supply input param: Company Name (String): IBM, MS, Google
		// return : the list of employee of the comp: ArrayList<String>
	
	
	public ArrayList<String> getEmpList(String compName) {
		System.out.println("Company name is:"+" "+ compName);
		
		ArrayList<String> emplist=new ArrayList<String>();
		
		if(compName.equalsIgnoreCase("Apple")) {
			emplist.add("Ali");
			emplist.add("Joby");
			emplist.add("Ray");
			emplist.add("Bob");
			
		}
		else if(compName.equalsIgnoreCase("Google")) {
			emplist.add("Edgar");
			emplist.add("Davis");
			emplist.add("Eve");
			
			
		}
		else if(compName.equalsIgnoreCase("Amazon")) {
			emplist.add("Grace");
			emplist.add("Boby");
			emplist.add("Amy");
			emplist.add("Dray");
			emplist.add("Mickael");
			
		}
		else if(compName.equalsIgnoreCase("Bob's Discount Fourniture")) {
			emplist.add("Ely");
			emplist.add("Anna");
			
			
		}
		else if(compName.equalsIgnoreCase("H&M")) {
			emplist.add("Oumar");
			emplist.add("Mike");
			emplist.add("Angel");
			emplist.add("Ingrid");
			
		}
		else {
			System.out.println("Not found...please enter the right company name"+ " "+compName);
		}
		return emplist;
	}
	
	
	
	

	public static void main(String[] args) {
		
		ConceptWithIfElseStatement c = new ConceptWithIfElseStatement();
		
		ArrayList<String> applelist = c.getEmpList("Apple");
		System.out.println(applelist.size());
		System.out.println(applelist);
		
		System.out.println("--------------->");
		
		ArrayList<String> googlelist = c.getEmpList("Google");
		System.out.println(googlelist.size());
		System.out.println(googlelist);
		
		System.out.println("--------------->");
		
		
		ArrayList<String> amazonlist = c.getEmpList("Amazon");
		System.out.println(amazonlist.size());
		System.out.println(amazonlist);
		
		System.out.println("--------------->");
		
		ArrayList<String> BobsDiscountFourniturelist = c.getEmpList("Bob's Discount Fourniture");
		System.out.println(BobsDiscountFourniturelist.size());
		System.out.println(BobsDiscountFourniturelist);
		
		System.out.println("--------------->");
		
		ArrayList<String> HMlist = c.getEmpList("H&M");
		System.out.println(HMlist.size());
		System.out.println(HMlist);
		
		
		
		
		

	}

}
