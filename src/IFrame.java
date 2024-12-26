import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame 
{
	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://nxtgenaiacademy.com/iframe/");
			Thread.sleep(2000);
			
			driver.findElement(By.className("fab fa-whatsapp")).click();
			driver.switchTo().parentFrame();
			System.out.println(driver.getWindowHandles());
		
		}

}
