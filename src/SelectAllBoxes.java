import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/hp/Documents/Automation%20Testing/Checkbox.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(WebElement s1:allcheckboxes)
		{
			s1.click();
			Thread.sleep(500);
		}
		
		//for deselecting selected checkboxes
		for(int i=allcheckboxes.size()-1;i>=0;i--)
		{
			allcheckboxes.get(i).click();
			Thread.sleep(600);
		}
		
		
	}

}
