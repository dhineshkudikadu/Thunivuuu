import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSuggestion {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi");
		List<WebElement> suggestion=driver.findElements(By.xpath("//span[@class='1CzsRN']/../../.."));
		System.out.println(suggestion.size());
		int a=suggestion.size();
		for (int i = 0; i < a; i++)
		{
			String b=suggestion.get(i).getText();
			System.out.println(b);
		}
	}

}
