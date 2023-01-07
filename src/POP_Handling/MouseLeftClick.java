package POP_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseLeftClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		 
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Insurance Project']"));
		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		//act.moveToElement(ele).perform();
		//act.click().perform();
		
		//act.moveToElement(ele).click().build().perform();
		
		act.click(ele).perform();
		

	}

}
