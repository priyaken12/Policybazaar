package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut 
{

	@Test(timeOut = 5000)
	public void TC3() throws InterruptedException 
	{
		Thread.sleep(3000);
		Reporter.log("----running TC3 ---",true);
	}
	
	
}
