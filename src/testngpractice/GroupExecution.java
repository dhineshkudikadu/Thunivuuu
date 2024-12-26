package testngpractice;

import org.testng.annotations.Test;

public class GroupExecution 
{
	@Test(groups = "smoke")
	public void register()
	{
		System.out.println("Register ID");
	}
	@Test(groups="system")
	public void login()
	{
		System.out.println("Login ID ");
	}
	@Test(groups = "smoke")
	public void logout()
	
	{
		System.out.println("Logout ID");
	}
	@Test(groups = "system")
	public void delete()
	{
		System.out.println("Delete ID");
	}
}
