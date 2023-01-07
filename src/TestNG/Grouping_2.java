package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_2 
{
	@Test(groups = "Claims" )
	public void TC5()
	{
		Reporter.log("running TC5");
	}
	
	@Test(groups = "Claims" )
	public void TC6()
	{
		Reporter.log("running TC6");
	}
	
	@Test(groups = "My Account" )
	public void TC7()
	{
		Reporter.log("running TC7");
	}

	@Test(groups = "Support" )
	public void TC8()
	{
		Reporter.log("running TC8");
	}

}
