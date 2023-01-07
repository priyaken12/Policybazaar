package POM_DDF_TESTNG_PropertyFile_FailedTCSS;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_CLass 
{
	
	WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.get(UtilityClass.ReadPRopFdata("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}
