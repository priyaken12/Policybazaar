package POMwithParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogInwithPwd 
{
	@FindBy(xpath="//input[@name='password']")private WebElement Password;
	@FindBy(xpath = "//span[text()='Sign in']")private WebElement SignIn;
	
	public PBLogInwithPwd(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    
	public void EnterPwd(String password)
	{
		Password.sendKeys(password);
	}
	
	public void ClickOnSignIn() 
	{
	   SignIn.click();	
	}
}
