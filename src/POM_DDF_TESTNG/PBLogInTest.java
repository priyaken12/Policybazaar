package POM_DDF_TESTNG;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMwithParameters.PBHomePage;
import POMwithParameters.PBLogInPage;
import POMwithParameters.PBLogInWithMobNum;
import POMwithParameters.PBLogInwithPwd;
import POMwithParameters.PBMyprofilePage;
import ddf.PBLoginPage;
import ddf.PBLoginWithMobNo;
import ddf.PBLoginWithPwd;
import ddf.PBMyAccountPage;
import ddf.PBMyHomePage;

public class PBLogInTest 
{
	Sheet sh;
	WebDriver driver;
	PBLogInPage login;
	PBLogInWithMobNum MobNum;
	PBLogInwithPwd pwd;
	PBHomePage home;
	PBMyprofilePage pfl;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\Desktop\\DDF1.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		 login = new PBLogInPage(driver);
	     MobNum=new PBLogInWithMobNum(driver);
		 pwd =new PBLogInwithPwd(driver);
		 home = new PBHomePage(driver);
		 pfl=new PBMyprofilePage(driver);
	
	}
		@BeforeMethod
		public void LoginToAppln()
		{
			
		  login.ClickOnSignIN();
		  MobNum.EnterMobNum(sh.getRow(0).getCell(0).getStringCellValue());
		  MobNum.ClickOnSignInWithPwd();
		  pwd.EnterPwd(sh.getRow(0).getCell(1).getStringCellValue());
		  pwd.ClickOnSignIn();
		  
		}
		
		@Test
		public void VerifyName() throws InterruptedException
		{
			Thread.sleep(3000);
			home.OpenMyAccount();
			home.MyProfile();
			pfl.SwitchtoChildWindow();
			
			String ActPN = pfl.verifyPersonName();
			String ExpPN = sh.getRow(0).getCell(2).getStringCellValue();
			
			Assert.assertEquals(ActPN, ExpPN, "Failed: both result are diff");
		}
		
		@AfterMethod
		public void LogOutApplin()
		{
			
		}
		@AfterClass
		public void CloseBrowser()
		{
			driver.quit();
		}
		
		
		
		
		
	
	
}
