package Session_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithID {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		System.out.println("Landing Page title is - " + driver.getTitle());
		
		
		// type in the text box on webpage opened By ID
		WebElement textBox = driver.findElement(By.id("email"));
		
		textBox.sendKeys("test@gmail.com");
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
	
	

}
