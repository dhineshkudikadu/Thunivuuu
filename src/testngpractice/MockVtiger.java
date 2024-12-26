 package testngpractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MockVtiger
{
	@Test
	public void tiger() throws InterruptedException, IOException
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		WebElement	res=driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		act.moveToElement(res).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[1]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Set Up Meeting with')]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,300);");
		WebElement	x=driver.findElement(By.xpath("(//p[@class='mb-1'])[2]/.."));
		Thread.sleep(2000);
		File a=x.getScreenshotAs(OutputType.FILE);
		File b=new File("./Screenshot.second/dk3.png");
		FileHandler.copy(a, b);
		
	}

}
