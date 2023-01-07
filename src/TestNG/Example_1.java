package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example_1 {

	@Test
	public void OpnAppln() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
