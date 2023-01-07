package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
    @Test
	public void TC1()                        //As per Alphabet order - 2
	{
		Reporter.log("Loged into appln ",true);
	}
	
	@Test
	public void TC2()                           //As per Alphabet order - 3
	{ 
		Reporter.log("Opend account ",true);
	}
	
	@Test                                         //As per Alphabet order - 1
	public void TC3()
	{
		Reporter.log("Opend Profile ",true);
	}
	
    @Test
	public void TC4()                          //As per Alphabet order - 4
	{
		Reporter.log("Verified profile ",true);
	}
	
	
	
}
