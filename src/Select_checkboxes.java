import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_checkboxes {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nykaafashion.com/women/c/6557?root=topnav_1&p=3&f=color_filter%3D67_");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("f-filters");
		
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//div[@role='checkbox']"));

		for(WebElement s1:allcheckboxes)
		{
			s1.click();
			Thread.sleep(500);
		}
		

	}

}
