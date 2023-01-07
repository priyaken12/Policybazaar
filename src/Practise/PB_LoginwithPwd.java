package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_LoginwithPwd 

{
	    @FindBy(xpath="//input[@type='password']")private WebElement PWD;
	    @FindBy(xpath="//span[text()='Sign in']")private WebElement FinlSignIn;
		
		public PB_LoginwithPwd(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		 
		public void EntrPwd()
		{
			PWD.sendKeys("Password@1");
		}
		
		public void ClickOnSignin()
		{
			FinlSignIn.click();
		}
}
