package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_2 
{
	    @Test(priority = 3)
		public void LoginAppln()                        //As per Alphabet order - 2
		{
			Reporter.log("Loged into appln ",true);
		}
		
		@Test(priority = -2)
		public void openMyacc()                           //As per Alphabet order - 3
		{ 
			Reporter.log("Opend account ",true);
		}
		
		@Test (priority = 0)                              //As per Alphabet order - 1
		public void ClickonmyProfile()
		{
			Reporter.log("Opend Profile ",true);
		}
		
	    @Test
		public void verifyMynam()                          //As per Alphabet order - 4
		{
			Reporter.log("Verified profile ",true);
		}
		
}
