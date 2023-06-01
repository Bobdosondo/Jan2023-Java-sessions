package javasessions;

import java.util.ArrayList;

public class Concept {
	
	//WAF
	//Supply a browser name:String:chrome/ff/safari/IE
	//buss logic:launch the browser
	//return true
	
public boolean launchBrowser(String browserName) {
	System.out.println("browser name:" + browserName);
	
	boolean flag =true;
	
	
	switch (browserName.toLowerCase().trim()) {
	
	case "chrome":
		System.out.println("launch chrome");
		break;
		
	case "firefox":
		System.out.println("launch firefox");
		break;
		
	case "safari":
		System.out.println("launch safari");
		break;
		
	case "ie":
		System.out.println("launch ie");
		break;

	default:
		
		System.out.println("please pass the right browser"+ " "+browserName);
		flag=false;
		break;
	}
	return flag;
}
	
	public ArrayList<String> getEmployeeList(String compName) {
		System.out.println("company name is:"+ compName);
		
		ArrayList<String> emplist= new ArrayList<String>();
		
		if(compName.equalsIgnoreCase("Apple")) {
			emplist.add("Rabi");
			emplist.add("Ina");
			emplist.add("Joah");
			
			
		}
		else if(compName.equalsIgnoreCase("Google")) {
			
			emplist.add("Bob");
			emplist.add("Mike");
			emplist.add("Ana");
			emplist.add("Judy");
			
		}
		else if(compName.equalsIgnoreCase("Ms")) {
			emplist.add("Max");
			emplist.add("Jordan");
			
		}
		else {
			System.out.println("Not found ...please pass the right comp name");
		}
		return emplist;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Concept  c = new Concept ();
		
		
		boolean b=c.launchBrowser("opera");
		if(b) {
			System.out.println("Enter the URL");
		}
		else {
			System.out.println("don't enter the URL");
		}
		
		ArrayList<String> l1=c.getEmployeeList("Apple");
		System.out.println(l1);
		System.out.println(l1.size());
		
		ArrayList<String> l2=c.getEmployeeList("Google");
		System.out.println(l2);
		
		ArrayList<String> l3=c.getEmployeeList("IBM");
		System.out.println(l3);
		System.out.println(l1.size());

	}

}
