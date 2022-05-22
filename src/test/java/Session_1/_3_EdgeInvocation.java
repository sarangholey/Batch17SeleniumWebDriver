package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _3_EdgeInvocation {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/msedgedriver.exe");
		
		
		WebDriver driver = new EdgeDriver();
		
		
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
//		driver.navigate().to("https://www.amazon.in");
//		//System.out.println("Title for amazon is -> " + driver.getTitle());
//		if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
//		{
//			System.out.println("Amazon title is correct");
//		}
//		else {
//			System.out.println("Amazon title is incorrect");
//		}
//		
//		driver.navigate().back();
//		
//		System.out.println("Title after navigating back is -> " + driver.getTitle());
//		
//		driver.navigate().forward();
//		
//		System.out.println("Title after navigating forward is -> " + driver.getTitle());
		
		
		
		
		driver.close();
		
		
	}

}
