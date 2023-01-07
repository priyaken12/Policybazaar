package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertclass 
{
	
	@Test
	public void TC() 
	{
		SoftAssert soft= new SoftAssert();
		
		boolean actResult = false;
		soft.assertTrue(actResult,"Failed1- act result is false:");
		
		String actResult1 = "Hi";
		String expResult = "Hello";
		soft.assertEquals(actResult1, expResult,"Failed2 -both results are diffrent:");
	}

}
