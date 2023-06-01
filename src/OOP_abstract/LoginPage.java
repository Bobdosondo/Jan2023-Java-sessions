package OOP_abstract;

public class LoginPage extends Page {
	
	//hidden constructor
	//default constructor
	// parent class constructor will be called first and then class constructor
	// always the default constructor will be called in the parent class
	
	public LoginPage() {
		System.out.println("login page constructor");
		
	}
	
	public LoginPage(int i) {
		System.out.println("1 param Login page constructor"+ i);
		
	}

	@Override
	public void title() {
		System.out.println("login title");
		
	}

	@Override
	public void url() {
		System.out.println("https://www.abc.com/login.html");
		
		
	}
	@Override
	public void calculatePageLoadTimeOut(){
		System.out.println("page time out -- 5 secs");
	}
	 public void forgotPassword() {
		 System.out.println("forgotPassword");
	 }
	 
	
}
