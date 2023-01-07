package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing 
{
	WebDriver driver=null;
	@Parameters("BrowserName")
	@Test
	public void openApp(String BrowserName) throws InterruptedException
	{
		if(BrowserName.equals("chrome"))
		{
			  driver=new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
		      driver=new FirefoxDriver();
		}
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
