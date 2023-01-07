package ddf;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccountPage 
{
   @FindBy(xpath="//input[@name='personName']")private WebElement FullName;
	WebDriver driver1;
	public PBMyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	
	public void SwitchToChildWindow()
	{
		Set<String> AllIds = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(AllIds);
		driver1.switchTo().window(al.get(1));
	}
	
	public void verifyPN() 
	{
		String ActFN = FullName.getAttribute("Value");
		String ExpFN = "Priyanka Kendre";
		
		if(ActFN.equals(ExpFN))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
	}
	
	
	
	
	
	
	
	
	
}
