package ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithMobNo {

	
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement MobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement SignInWithPwd;
	
	public PBLoginWithMobNo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterMobNo()
	{
		MobNum.sendKeys("9158611676");
	}
	
	public void ClickOnSignInWithPwd()
	{
		SignInWithPwd.click();
	}
	
	
}
