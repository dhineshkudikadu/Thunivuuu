package testngpractice;


import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority 
{
	@Test
	public void semma() throws IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.instagramt.com");
		String title	=driver.getTitle();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("dine");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("kumar");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567890");
		WebElement ele= driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
		File fis=ele.getScreenshotAs(OutputType.FILE);
		File des=new File("./Data/Screenshot/dk22.png");
		FileHandler.copy(fis, des);
		WebElement ele2= driver.findElement(By.id("day"));
		Select sel=new Select(ele2);
	      sel.selectByIndex(0);
	     // JavascriptExecutor js=(JavascriptExecutor)driver;
	      //js.executeScript("window.scroolTo[0,100];");
	     
		
		//driver.quit();
	}
	
	
}
