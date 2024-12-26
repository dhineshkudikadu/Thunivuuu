package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingPom 
{
	@Test
	public void wokingOnPom() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Pom1 page=new Pom1(driver);
		page.getEmailbtn().sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
