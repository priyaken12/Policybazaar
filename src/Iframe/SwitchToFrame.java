package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/default.asp");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ElePath = driver.findElement(By.xpath("//button[text()=' Click me to display Date and Time.']"));
		
		driver.switchTo().frame(ElePath);
		
		driver.findElement(By.xpath("//button[text()=' Click me to display Date and Time.']")).click();
		
	}

}
