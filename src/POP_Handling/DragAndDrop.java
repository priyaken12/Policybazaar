package POP_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[text()='Drag and Drop Action']")).click();
        
        Thread.sleep(3000);
        
        //WebElement src = driver.findElement(By.xpath("//a[@class='button button-orange'][2]"));
        //WebElement dstn = driver.findElement(By.xpath("//div[@class='ui-widget-content'][3]"));
        
        //act.dragAndDrop(src, dstn).perform();
        WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
        
		act.dragAndDrop(src, dest).perform();
		
       // act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
	}

}
