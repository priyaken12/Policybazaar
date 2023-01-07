package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ddf.PBLoginPage;

public class PB_MAINTest {

public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	PB_SignPage login=new PB_SignPage(driver);
	login.ClickOnSignIn();

	Thread.sleep(3000);
	
	PB_LoginwithConNum num=new PB_LoginwithConNum(driver);
	num.EntrContactNum();
	num.ClickOnSigninpwd();
	
	PB_LoginwithPwd pwd=new PB_LoginwithPwd(driver);
	pwd.EntrPwd();
	pwd.ClickOnSignin();
	Thread.sleep(3000);
	
	
    PB_HMPAge hm= new PB_HMPAge(driver);
    hm.MovCursortoAcctxt();
    hm.ClickOnMyProfile();
    
    Thread.sleep(3000);
	
    driver.quit();

}}