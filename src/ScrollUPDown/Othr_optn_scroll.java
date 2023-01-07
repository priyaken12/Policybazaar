package ScrollUPDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Othr_optn_scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
	
		// find Facebook webelement
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook Lite']"));
		
		Thread.sleep(3000);
		
		// This will scroll the page till the element is found
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", facebook);
		
		Thread.sleep(9000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", facebook);
	}

}
