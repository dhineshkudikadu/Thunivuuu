package testngpractice;

import org.testng.annotations.Test;

public class DependsOnMethods 
{
	@Test
	public void registerID()
	{
		System.out.println("Registered ID");
	}
	
	@Test (dependsOnMethods = {"deleteID","registerID"})
	public void loginId()
	{
		System.out.println("Login ID");
	}
	@Test(dependsOnMethods = {"registerID"})
	public void deleteID()
	{
		System.out.println("Deleted ID");
	}
}
