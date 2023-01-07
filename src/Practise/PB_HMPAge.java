package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_HMPAge 
{
     WebDriver driver1;
	@FindBy(xpath="//div[@class='userprofile']")private WebElement MyACC;
    @FindBy(xpath="//span[text()=' My profile ']")private WebElement MyPfl;
	
	public PB_HMPAge(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	 
	public void MovCursortoAcctxt()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(MyACC).perform();
				
	}
	
	public void ClickOnMyProfile()
	{
		MyPfl.click();
	}
	
	
}
