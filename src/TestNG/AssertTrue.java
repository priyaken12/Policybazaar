package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue 
{
	
	@Test
	public void asssertTrue() 
	{
		boolean actResult=false;   //here result should be true to run test case
		Assert.assertTrue(actResult,"Failed- actResult is false:   ");
	}

}
