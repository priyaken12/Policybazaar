package Auto_Suggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("samsung");
		
		Thread.sleep(3000);
		
	    String ExpText = "samsung z fold 4";
	    
	    List<WebElement> allexpectoption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	    
	    for(WebElement s1:allexpectoption)
	    {
	    	String Acttext = s1.getText();
	    	if(Acttext.equals(ExpText))
	    		
	    	{
	    		s1.click();
	    		break;
	    	}
	    }
	    
	    
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("redmi");
		
		Thread.sleep(1000);
		
		String expText="redmi 10";
		
		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement s1: allOptions)
		{
			String actText = s1.getText();
			if(actText.equals(expText))
			{
				s1.click();
				break;

	}

}
*/