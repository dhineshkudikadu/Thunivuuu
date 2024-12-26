package testngpractice;

import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(priority = 1)
	public void registerID()
	{
		System.out.println("Registered ID");
	}
	
	@Test (priority = 2,invocationCount = 2)
	public void loginId()
	{
		System.out.println("Login ID");
	}
	@Test (priority = 0,invocationCount = 3)
	public void delete()
	{
		System.out.println("Deleted ID");
	}
}
