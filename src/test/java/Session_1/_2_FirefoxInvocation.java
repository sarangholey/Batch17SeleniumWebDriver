package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _2_FirefoxInvocation {
	
	
	public static void main(String[] args)
	{
		
		// Automation 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarang\\eclipse-workspace\\Batch17SeleniumWebDriver\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().refresh();
		
//		driver.get("https://www.facebook.com/");
//		
//		String title = driver.getTitle();
//		
//		String titleExpected = "Facebook – log in or sign up";
//		
//		System.out.println("Web page title is -> " + title);
//		
//		// Validation
//		if(title.equals(titleExpected))
//		{
//			System.out.println("Title matched");
//		}
//		else
//		{
//			System.out.println("Title donen't match");
//		}
//		
//		driver.close();
	}

}
