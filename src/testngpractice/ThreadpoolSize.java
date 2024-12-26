package testngpractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ThreadpoolSize 
{
	
	@Test(invocationCount = 10,threadPoolSize = 5,groups = "smoke",priority = 2)
	public void register()
	{
		
		System.out.println("registerID");
		
	}
	@Test(groups = "system",invocationCount = 5,threadPoolSize = 3,priority = 1)
	public void login()
	{
		System.out.println("LoginID");
	}
	@Test(groups = "smoke",invocationCount = 5,threadPoolSize = 2,priority = 0)
	public void logout()
	{
		System.out.println("LogoutID");
	}
	
	
}
