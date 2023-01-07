package POM_DDF_TESTNG_PropertyFile_FailedTCSS;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyprofilePage 
{

	@FindBy(xpath = "//input[@name='personName']")private WebElement PersonName;
	WebDriver driver1;
	
	public PBMyprofilePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	
	public void SwitchtoChildWindow() 
	{
		Set<String> AllIds = driver1.getWindowHandles();
		ArrayList<String> Al=new ArrayList<String>(AllIds);
		driver1.switchTo().window(Al.get(1));		
	}
	
	public String verifyPersonName()
	{
		String ActualPN = PersonName.getAttribute("value");
		return ActualPN;
		
		/*if(ActualPN.endsWith(ExpectPN))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}*/
	}
}
