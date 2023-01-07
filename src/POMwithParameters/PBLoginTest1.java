package POMwithParameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\Documents\\Automation Testing\\DDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		PBLogInPage log= new PBLogInPage(driver);
				log.ClickOnSignIN();
		
		PBLogInWithMobNum Mob=new PBLogInWithMobNum(driver);
		String MobileNumber = sh.getRow(1).getCell(0).getStringCellValue();
		Mob.EnterMobNum(MobileNumber);
		Mob.ClickOnSignInWithPwd();
		
		PBLogInwithPwd pass=new PBLogInwithPwd(driver);
		pass.EnterPwd(sh.getRow(1).getCell(1).getStringCellValue());
		pass.ClickOnSignIn();
		
		PBHomePage hom=new PBHomePage(driver);
		hom.OpenMyAccount();
		hom.MyProfile();
		
		PBMyprofilePage FN= new PBMyprofilePage(driver);
		FN.SwitchtoChildWindow();
		//FN.verifyPersonName(sh.getRow(1).getCell(2).getStringCellValue());
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
