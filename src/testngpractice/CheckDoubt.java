package testngpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDoubt {
	@Test
	public void workingWithPopups() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK')])[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Robot r	=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		Set<String> windowID=driver.getWindowHandles();
		for (String windowIDS : windowID) 
		{
			System.out.println(windowIDS);
		}
		Iterator<String> it=windowID.iterator();
		
		String parentId=(String) it.next();
		System.out.println(parentId);
		String str2=(String) it.next();
		System.out.println(str2);
		
		driver.switchTo().window(str2);
		driver.get("https://www.flipkart.com/");
//		driver.quit();
	
	}
}
