package testngpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoWebpageNew2 
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
		
		WebElement ele2=driver.findElement(By.id("products-pagesize"));
		Select sel2=new Select(ele2);
		System.out.println(sel2.isMultiple());
		List<WebElement> str2=sel2.getOptions();
		int count2=str2.size();
		System.out.println(count2);
		
		
		for (int i = 0; i < count2; i++) 
		{
			ele2=driver.findElement(By.id("products-pagesize"));
			sel2=new Select(ele2);
			sel2.selectByIndex(i);
			System.out.println(i);
		}
	}

}
