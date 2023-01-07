package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_2 
{
	
@Test
public void openFacebookApp() throws InterruptedException 
{

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");

	Thread.sleep(5000);
	
	driver.close();
}}