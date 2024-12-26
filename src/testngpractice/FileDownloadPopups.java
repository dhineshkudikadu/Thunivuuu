package testngpractice;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileDownloadPopups 
{
	@Test
	public void fileDownload()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.findElement(By.xpath("(//p[contains(text(),'Java')])[1]/../p[2]")).click();
	}

}
 