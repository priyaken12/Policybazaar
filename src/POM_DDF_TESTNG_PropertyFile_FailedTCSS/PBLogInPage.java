package POM_DDF_TESTNG_PropertyFile_FailedTCSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogInPage 
{

	@FindBy(xpath="//a[text()='Sign in']")private WebElement SignIN;
	
	
	public PBLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnSignIN()
	{
		SignIN.click();
	}
	
	
		
}
