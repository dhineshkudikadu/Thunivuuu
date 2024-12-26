package testngpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MockVtiger2 
{
	@Test
	public void mocktig2() throws InterruptedException, IOException 
	{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.get("https://demowebshop.tricentis.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
			FileInputStream fis= new FileInputStream("./Data/Propertyfile/DataDrivenProperties.txt");
			Properties p=new Properties();
			p.load(fis);
			driver.findElement(By.id("Email")).getText();
			
			
			
	}
}
