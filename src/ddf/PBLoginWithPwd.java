package ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithPwd 
{

	@FindBy(xpath="//input[@type='password']")private WebElement Password;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement SignIn;
	
	public PBLoginWithPwd(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void EnterPassword()
	{
		Password.sendKeys("Password@1");
	}
	public void ClickOnSignIn()
	{
		SignIn.click();
	}
}
