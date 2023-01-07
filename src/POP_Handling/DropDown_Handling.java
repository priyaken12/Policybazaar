package POP_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown_Handling {

	public static void main(String[] args) throws InterruptedException 
	{
		
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.flipkart.com/");
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    
    WebElement Ele = driver.findElement(By.xpath("//div[@class='exehdJ']"));
    
        Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(Ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Advertise']")).click();
		
		
		
	}

}
