package ddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Documents\\Automation Testing\\DDF.xlsx");
		Sheet sh= WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		//Enter mob no 
	    String MobNo = sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(MobNo);
		
		//Click on Sign In with Password
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(5000);
		//Enter password
		String pwd = sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		Thread.sleep(5000);
		
		WebElement Myacc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(Myacc).perform();
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(allIds);
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(5000);
		String ActPN = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String exp = sh.getRow(1).getCell(2).getStringCellValue();
		
		if(ActPN.equals(exp))
		{
			System.out.println("Pass");	
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
