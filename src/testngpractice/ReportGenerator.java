package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportGenerator 
{
	@Test
	public void test()
	{
		Reporter.log("hi");
		Reporter.log("Hello",false);
		Reporter.log("Bye",true);
	}
}
