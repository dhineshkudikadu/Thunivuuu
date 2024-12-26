package testngpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass 
{
	@Test
	public void robot() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yantra.com");
		Thread.sleep(2000);
		Robot rot=new Robot();
		rot.keyPress(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		rot.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		rot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		rot.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		rot.keyRelease(KeyEvent.VK_CONTROL);
		
	}
}
