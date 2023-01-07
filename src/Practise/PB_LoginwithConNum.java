package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_LoginwithConNum 
{

    @FindBy(xpath="(//input[@type='number'])[2]")private WebElement ContNum;
    @FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement SignwithPwd;
	
	public PB_LoginwithConNum(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 
	public void EntrContactNum()
	{
		ContNum.sendKeys("9158611676");
	}
	
	public void ClickOnSigninpwd()
	{
		SignwithPwd.click();
	}
	
	
	
	
	
	
	
}
