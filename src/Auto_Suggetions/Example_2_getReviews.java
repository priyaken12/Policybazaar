package Auto_Suggetions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_2_getReviews {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
        
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("SAMSUNG Galaxy S22 Plus 5G");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		// this path for dynamic element  means this element is variable it will varry their data
		String reviews = driver.findElement(By.xpath("((//a[@class='_1fQZEK'])[1]//span)[8]")).getText();
		                                              //tagname of parent class,mobile index,tagname of any child,indexof element
		System.out.println(reviews);
		
	}

}
