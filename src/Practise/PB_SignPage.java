package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_SignPage 
{

	@FindBy(xpath="//a[@class='sign-in']")private WebElement Signin;
	
	public PB_SignPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 
	public void ClickOnSignIn()
	{
		Signin.click();
	}
	
	
	
}
