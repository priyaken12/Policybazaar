package POP_Handling;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.auto.common.MoreElements;

public class HandlingofDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//Step1: Idendify dropdown element
	    WebElement moreEle = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		
		  Actions Act = new Actions(driver);
		  
		  Act.moveToElement(moreEle).perform();
		  
		  Thread.sleep(5000);
		  
		//click on advertise link
			driver.findElement(By.xpath("//div[text()='Advertise']")).click();

	}

}
