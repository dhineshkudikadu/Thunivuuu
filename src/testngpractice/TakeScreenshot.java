package testngpractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot 
{
	@Test
	public void takescreenshot() throws IOException, InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		TakesScreenshot take=(TakesScreenshot) driver;
		Thread.sleep(2000);
		File a=take.getScreenshotAs(OutputType.FILE);
		File b=new File("./Screenshot.second/dk2.png");
		org.openqa.selenium.io.FileHandler.copy(a, b);
		driver.quit();
		
			}

}
