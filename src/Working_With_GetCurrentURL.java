import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SetWindowSize;
import org.openqa.selenium.chrome.ChromeDriver;
public class Working_With_GetCurrentURL {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.com/");
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[@role='button']")).click();
	//driver.findElement(By.xpath("//input[@type='text']")).click();
	//driver.findElement(By.partialLinkText("//img[@class=\"-dOa_b\"]")).click();
		

	}
	
	

}
