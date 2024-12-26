package testngpractice;

import org.testng.annotations.Test;

public class Enabled 
{
	@Test
	public void registerID()
	{
		System.out.println("Registered ID");
	}
	
	@Test (enabled = false)
	public void loginId()
	{
		System.out.println("Login ID");
	}
	@Test(enabled = false)
	public void delete()
	{
		System.out.println("Deleted ID");
	}
}
