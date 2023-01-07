package ScrollUPDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_UP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://www.facebook.com/");
		
		// down --> 2nd parameter +ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(3000);				
		
		// up --> 2nd parameter -ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)");
		
		
//		Thread.sleep(3000);
//		//right  --> 1st parameter +ve value
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
//		

		
//		Thread.sleep(3000);
//		//left  --> 1st parameter -ve value
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(-300,0)");
//		
	}

}
