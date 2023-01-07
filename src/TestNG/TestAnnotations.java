package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotations 
{

	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("Opened browser",true);
	}
	
	@BeforeMethod
	public void LoginAppln()
	{
		Reporter.log("Loged into appln ",true);
	}
	
	
	@Test(invocationCount = 3)
	public void VerifyMobNo()
	{
		Reporter.log("Verified Mob no", true);
	}
	
	@Test(enabled = false)
	public void VerifyPersonName()
	{
		Reporter.log("Verified fullname",true);
	}
	
	@AfterMethod
	public void LogOutAppln()
	{
		Reporter.log("Loged out to appln ",true);
	}
	
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("Closed browser",true);
	}
	
	
	
	
	
	
}
