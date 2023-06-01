package WEBDIVER_Arch;

public class FireFoxDriver implements WebDriver {
	
	public FireFoxDriver() {
		System.out.println("launch FireFoxDriver browser....");
		
	}

	

	@Override
	public void get(String url) {
		System.out.println("Entering the url:" + url);
		
	}

	@Override
	public String getTitle() {
		
		return "Amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("Click on:"+ element);
		
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering "+ value + "into"+ element );
		
		
	}

	@Override
	public void close() {
		System.out.println("close browser");
		
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("finding element by using:"+ element);
		
		
	}


}
