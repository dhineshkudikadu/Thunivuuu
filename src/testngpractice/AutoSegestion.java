package testngpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSegestion 
{
	@Test
	public void testName() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='iphone 14'])[6]")).click();
		Thread.sleep(2000);
		List<WebElement> ele= driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14')]"));
		int count=ele.size();
		System.out.println(count);
		for (WebElement webElement : ele)
		{
			System.out.println(webElement.getText());
		}
	}
}
