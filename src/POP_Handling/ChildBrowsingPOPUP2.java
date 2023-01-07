package POP_Handling;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowsingPOPUP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//click on "new tab" from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window ID
		Set<String> AllIds = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(AllIds);
		
		//switch to child window
		String childwindowID = al.get(1);
		
		//switch to child window
				driver.switchTo().window(childwindowID);      
		
		//click on "Training" link from child window
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		//switch to Main page
		driver.switchTo().window(al.get(0));
		
		//click "NewWindow" btn from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
	}

}
