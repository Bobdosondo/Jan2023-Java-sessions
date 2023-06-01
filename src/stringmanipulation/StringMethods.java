package stringmanipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String s = "This is my java code,i love";
		int len = s.length();
		System.out.println(len);
		
		
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(11));
		//System.out.println(s.charAt(21)); SIOB
		//System.out.println(s.charAt(-1));SIOB
		
		
		System.out.println(s.indexOf('T'));
		System.out.println(s.indexOf('i'));//1rst occurrence
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.lastIndexOf('i'));
		
		System.out.println("---->");
		
		//index of String
		
		System.out.println(s.indexOf("java"));
		//System.out.println(s.indexOf("Test"));SIOB
		
		String t ="Welcome admin";
		System.out.println(t.indexOf("admin"));
		if(t.indexOf("admin")==8) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		
		}
		
		//remove space from the corners
		
		String test = "     hello world     ";
		System.out.println(test);
		test.trim();
		System.out.println(test.trim());
		
		
		//convert into upper or lower case
		String p = "This is a java code";
		System.out.println(p.toUpperCase());
		System.out.println(p.toLowerCase());
		
		//
		String dob= "01-01-2000";//01/01/2000
		System.out.println(dob);
		System.out.println(dob.replace('-', '/'));
		
		String test1 = "     hello world for sure    ";
		System.out.println(test1);
		System.out.println(test1.replace(" ", ""));
		
		//
		String st = "hello world";
		String st1="hello World";
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		System.out.println(st.equalsIgnoreCase(st1));
		
		String la = "   hello    Bobdo   ";
		System.out.println(la.replaceAll("\\s", ""));//to remove all spaces
		
		
		//
		String browser = "CHROMe ";
		
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("Please pass the right browser");
		}
		
		
		//check if a word is present in the sentence
		String ps = "This is selenium testing ";
		System.out.println(ps.contains("testing"));
		System.out.println(ps.concat("for java"));
		
		System.out.println("-------->");
		
		//split functions
		 String lang = "JAVA_PYTHON_DOTNET_RUBY";
		 System.out.println(lang.split("_")[1]);
		 String l[]=lang.split("_");
		 System.out.println(l[0]);
		 System.out.println(Arrays.toString(l));
		 
		 String pop = "xXseleniumxXXtestingXxXjavaxXxpythonX";
		 String p1[]=pop.split("xX");
		 System.out.println(p1[0]);//blank
		 System.out.println(p1[1]);
		 System.out.println(Arrays.toString(p1));
		 
		 String empInfo="madhav|singh|pune|india|ibm|sdet";
		String emp[] =empInfo.split("\\|");//-\\for safe character
		System.out.println(Arrays.toString(emp));
		for(String e:emp) {
			System.out.println(e);
		}
		
		//string to integer conversion
		String x ="100";
		System.out.println(x+20);//10020
		int x1=Integer.parseInt(x);//100
		System.out.println(x1+20);//120
		
		//assignment
		String z ="100A";//not allow
		String z1=z.replace("100A", "100");//100
		int z2=Integer.parseInt(z1);
		System.out.println(z2);
		
		
		//String to double
		String u ="12.33";
		double d=Double.parseDouble(u);//12.33
		System.out.println(d+10);
		
		//int to String:
		int k =100;
		String s1 =String.valueOf(k);
		System.out.println(s1+20);
		
		
		//String to boolean
		
		String flag="true";
		boolean bl=Boolean.parseBoolean(flag);
		System.out.println(bl);
		if(bl) {
			System.out.println("run my test cases");
		}
		//
		
		String h ="Testing with selenium";
		String g ="Development with selenium";
		System.out.println(h.startsWith("Testing"));
		System.out.println(g.endsWith("selenium"));
		
		 
		 //substring
		 String messg = "Your transaction id is 12345";
		 System.out.println(messg.substring(messg.indexOf("is")+2).trim());
		 //System.out.println(messg.substring(messg.indexOf("is")+3)());
		String trid = messg.substring(messg.indexOf("is")+2).trim();
		System.out.println(trid);
		
		String mg = "Your transaction id is 12345";
		System.out.println(mg.substring(0, 9));//will only give you from 0-8
		System.out.println(mg.substring(mg.indexOf("is")+2, mg.length()).trim());
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
