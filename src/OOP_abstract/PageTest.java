package OOP_abstract;

public class PageTest {
	
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.calculatePageLoadTimeOut();
		lp.forgotPassword();
		lp.displayLogo();
		Page.footer();
		LoginPage.footer();
	
		
		
		
		//top casting:
		//child class object can be referred by parent abstract class ref variable
		 Page p = new LoginPage();
		p.title();
		p.url();
		p.calculatePageLoadTimeOut();
		p.displayLogo();
		//p.footer();access by class name
		// down casting
		
		 // LoginPage lp1 = new Page();
	}

}
