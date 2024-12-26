package testngpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoWebpageNew 
{
	@Test
	public void demoNew()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sort by')]")).click();
		WebElement ele=driver.findElement(By.id("products-orderby"));
		Select sel=new Select(ele);
		List<WebElement>	str=sel.getOptions();
		
		int count=str.size();
		System.out.println(count);
		/*for (WebElement webElement : str) 
		{
			System.out.println(webElement.getText());
		}*/
		for (int i = 0; i < count; i++) 
		{
			ele=driver.findElement(By.id("products-orderby"));
			sel=new Select(ele);
			sel.selectByIndex(i);
		}
		
	}

}
