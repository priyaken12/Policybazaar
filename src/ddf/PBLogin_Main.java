package ddf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLogin_Main 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		PBLoginPage login = new PBLoginPage(driver);
		login.ClickOnSignINBtn();
		
		Thread.sleep(2000);
		
		PBLoginWithMobNo Mobno= new PBLoginWithMobNo(driver);
		Mobno.enterMobNo();
		Mobno.ClickOnSignInWithPwd();
		
		Thread.sleep(2000);
		
		PBLoginWithPwd pwd =new PBLoginWithPwd(driver);
		pwd.EnterPassword();
		pwd.ClickOnSignIn();
		Thread.sleep(2000);
		
		PBMyHomePage HP=new PBMyHomePage(driver);
		HP.openMyaccount();
		HP.ClickOnmyprofile();
		
		
		Thread.sleep(2000);
		
		PBMyAccountPage AP=new PBMyAccountPage(driver);
		AP.SwitchToChildWindow();
		AP.verifyPN();
		
		Thread.sleep(5000);
		
		driver.quit();
			
	}
	
	
	
}
