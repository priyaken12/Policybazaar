package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_1 
{
	@Test
	public void TC() 
	{
		boolean actResult=false;  //to pass test case actresult should be true
		Assert.assertTrue(actResult,"Failed1- act result is false:   ");
									
		String actResult1="Hi";
		String expResult1="Hello";      //to pass test cases actresult and expresult should be equal
		Assert.assertEquals(actResult1, expResult1,"Failed2 -both results are diffrent:   ");
	}

}
