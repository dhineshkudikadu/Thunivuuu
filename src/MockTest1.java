import java.awt.desktop.QuitEvent;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MockTest1 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Wipro jobs");
		driver.findElement(By.xpath("(//span[text()='wipro jobs'])[3]")).click();
		Thread.sleep(2000);
		TakesScreenshot take=(TakesScreenshot)driver;
		File  src=take.getScreenshotAs(OutputType.FILE);
		File dec=new File("./Screenshot.second/dk.png");
		FileHandler.copy(src,dec);
		
	}
	

}
