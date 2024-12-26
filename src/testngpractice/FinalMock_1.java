package testngpractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FinalMock_1 

{
	@Test
	public void T1() throws InterruptedException, IOException
	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		Thread.sleep(3000);

		Actions act=new Actions(driver);
		WebElement	resoucres=driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		act.moveToElement(resoucres).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[1]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,300);");
		WebElement	x=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div[2]"));
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		Thread.sleep(2000);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File desc=new File("./Screenshot.second/Test1.png");
		FileHandler.copy(src, desc);
		driver.quit();
	}
}
