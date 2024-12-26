import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BBC 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		WebElement ele1 = driver.findElement(By.xpath("//h2[text()='Latest Business News']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrolIntoView(true)", ele1);
		List<WebElement> ele2 = driver.findElements(By.xpath("//h2[contains(text(),'Latest Business News')]/../ul/li/a/h3"));
		System.out.println(ele2.size());
		for (WebElement webElement : ele2) 
		{
			System.out.println(webElement.getText());
		}
		driver.quit();
	}

}
