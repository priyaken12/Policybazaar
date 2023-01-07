package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse 
{
	@Test
	public void asssertFalse() 
	{
		boolean actResult=true; //result should be false to run
		Assert.assertFalse(actResult,"Failed- act result is true:   ");
	}
	

}
