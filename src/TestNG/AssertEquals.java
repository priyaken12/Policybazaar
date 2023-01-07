package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals 
{
	@Test
	public void asssertEquals() 
	{
		String actResult="Hi";
		String expResult="Hi";
		Assert.assertEquals(actResult, expResult,"Failed-both results are diffrent:   ");
		
	}
	

}
