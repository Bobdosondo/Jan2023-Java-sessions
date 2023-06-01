package OOP_encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launch browser");
		
		checkBrowserVersion();
		checkOsCompatibility();
		checkRAM();
		checkCPU();
		System.out.println("browser is launched");
	}
	
	private void checkBrowserVersion() {
		System.out.println("check browser version");
		
	}
	private void checkOsCompatibility() {
		System.out.println("check os compatibility");
		
	}
	private void checkRAM() {
		System.out.println("check RAM");
		
	}
	private void checkCPU() {
		System.out.println("Check CPU");
		
	}

	

}
