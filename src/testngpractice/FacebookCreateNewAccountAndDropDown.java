package testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookCreateNewAccountAndDropDown
{
	@Test
	public void testName() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("dinesh");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("6380954619");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("superman@123");
		WebElement ele=driver.findElement(By.id("day"));
		Thread.sleep(2000);
		Select sel=new Select(ele);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.id("month"));
		sel=new Select(ele2);
		sel.selectByValue("10");
		WebElement ele3=driver.findElement(By.id("year"));
		sel=new Select(ele3);
		sel.selectByVisibleText("2000");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(1000);
		
	}

}
 