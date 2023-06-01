package OOP_encapsulation;

public class AmazonLogin {

	// registration

	public static void main(String[] args) {

		LoginPage lp = new LoginPage("Bobdosond@gmail.com", "Son@1234");
		System.out.println(lp.getUserName() + " " + lp.getPassword());

		System.out.println("----->");

		// login

		lp.doLogin(lp.getUserName(), lp.getPassword());

		System.out.println("----->");

		// reset pwd
		lp.setPassword("Son@567");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		System.out.println("----->");
		
		//new user Ricky;
		
		
		LoginPage lp1 = new LoginPage("Ricky@gmail.com", "ricky@1234");
       
		//login
		lp1.doLogin(lp1.getUserName(), lp1.getPassword());
	}

}
