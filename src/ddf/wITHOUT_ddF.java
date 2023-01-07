package ddf;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class wITHOUT_ddF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//click on SignIn btn
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
	    
		//Enter Mob no
	    driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9158611676");
	    
	    Thread.sleep(5000); 
	    
		//Click on sign in with password
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		//Enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@1");
		//click on sign in
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		Thread.sleep(5000);
		
		//To get drowndown
		WebElement myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
	    act.moveToElement(myacc).perform();
	    
	    //Click on my profile
	    driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	    
	    //Switch to child window
	    Set<String> AllIDs = driver.getWindowHandles();
	    ArrayList<String> al= new ArrayList<String>(AllIDs);
	    driver.switchTo().window(al.get(1));
	    
	    String ActPN = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
	    String ExPN = "Priyanka Kendre";
	  
	    if(ActPN.equals(ExPN))
	    {
	    	System.out.println("Pass");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    }
	    
	    Thread.sleep(5000);
	    driver.quit();
	    
	    
	    
	    
	}

	
	}  


