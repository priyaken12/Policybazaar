package POM_DDF_TESTNG_BaseNUtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogInWithMobNum 
{
	
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement MobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement SignInWithPwd;
	
	public PBLogInWithMobNum(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void EnterMobNum(String MobileNumber)
	{
		MobNum.sendKeys(MobileNumber);
	}
		
	public void ClickOnSignInWithPwd() 
	{
		SignInWithPwd.click();
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


