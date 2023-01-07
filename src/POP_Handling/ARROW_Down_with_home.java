package POP_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ARROW_Down_with_home {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        
        Actions act=new Actions(driver);
        act.click(month).perform();
        act.sendKeys(Keys.HOME).perform();
        
        Thread.sleep(3000);
        
        for(int i=1;i<=7;i++)
        {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        }
        //select option using Enter Key 
        act.sendKeys(Keys.ENTER).perform();
        
        
}}
