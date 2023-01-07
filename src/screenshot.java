import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com//");
		
	   File src = ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   System.out.println(src);
	   
	   File dest = new File("C:\\Users\\hp\\Documents\\Sample\\screenshot\\sample1.jpg");
	   
		FileHandler.copy(src, dest);
	}

}
