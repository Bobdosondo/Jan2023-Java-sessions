package WEBDIVER_Arch;

public class AmazonTest {

	public static void main(String[] args) {
		
		
		//chrome
		//ChromeDriver driver = new ChromeDriver();
		//SafariDriver driver =new SafariDriver();
		//FireFoxDriver driver =new FireFoxDriver();
		
		String browser = "Safari";
		WebDriver driver = null;
		
		
		//cross browser logic
		if(browser.equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equals("Safari")){
			driver = new SafariDriver();
		}
		else if(browser.equals("FireFox")) {
			driver = new FireFoxDriver();
		}
		else {
			System.out.println("please pass the right browser");
		}
		
		
		driver.get("https://wwww.amazon.com");
		String title=driver.getTitle();
		System.out.println("page title is :"+title);
		driver.findElement("emailId");
		driver.sendKeys("emailId", "bob@gmail.com");
		driver.findElement("password");
		driver.sendKeys("password", "bob@1234");
		driver.findElement("LoginButton");
		driver.click("LoginButton");
		driver.close();
		

	}

}
