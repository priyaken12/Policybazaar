package POP_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPOPUP {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(3000);
		
		//click on customer ID and send value
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("120");
		
		//click on submit
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//get text of alert window
		String Text = driver.switchTo().alert().getText();
		System.out.println(Text);
		
		//for cancel the alert window
		//driver.switchTo().alert().dismiss();
		
		//for click on ok or accept or continue the process further
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//Click on 2nd alert window
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//

	}

}
