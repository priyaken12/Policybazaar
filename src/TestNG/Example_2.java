package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_2 {

	
	@Test
	public void TC1()              //test case or test method 
	{
		Reporter.log("--running test case 1--",true);       //classname.methodname("message", true)
	}
	
	@Test
	public void TC2()              //test case or test method 
	{
		Reporter.log("---running test case 2---",true);
	}
	
	@Test
	public void TC3()              //test case or test method 
	{
		Reporter.log("---running test case 3---",true);
	}
	
	
	
	
}
