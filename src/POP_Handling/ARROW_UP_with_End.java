package POP_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ARROW_UP_with_End {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	        
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    
	    WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	    
	    Actions act=new Actions(driver);
	    act.click(day).perform();
		act.sendKeys(Keys.END).perform();
		
		for(int i=1;i<=25;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
       
		act.sendKeys(Keys.ENTER).perform();
	}

}