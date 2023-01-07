package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_1 {

	@Test(groups = "Claims" )
	public void TC1()
	{
		Reporter.log("running TC1");
	}
	
	@Test(groups = "My Account" )
	public void TC2()
	{
		Reporter.log("running TC2");
	}
	
	@Test(groups = "My Account" )
	public void TC3()
	{
		Reporter.log("running TC3");
	}

	@Test(groups = "Support" )
	public void TC4()
	{
		Reporter.log("running TC4");
	}
}
