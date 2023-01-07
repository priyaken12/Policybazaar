
package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals 
{
	@Test
	public void asssertEquals() 
	{
		String actResult="Hi";
		String expResult="Hi";         //here expresult should be diff than actResult
		Assert.assertNotEquals(actResult, expResult,"Failed- both results are same:  ");
		
	}
}
