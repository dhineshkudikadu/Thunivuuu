package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pom1 
{
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement emailbtn;
	@FindBy(id="pass")
	private WebElement passwordbtn;
	public WebElement getEmailbtn() 
	{
		return emailbtn;
	}
	public WebElement getPasswordbtn() 
	{
		return passwordbtn;
	}
	
}
