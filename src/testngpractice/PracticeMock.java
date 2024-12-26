package testngpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeMock 
{
	@Test
	public void Prac()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sort by')]"));
		
		WebElement ele= driver.findElement(By.id("products-orderby"));
		Select sel=new Select(ele);
		List<WebElement> opp=sel.getOptions();
		int count=opp.size();
		System.out.println(count);
		for (int i = 0; i<count; i++) 
		{
			ele= driver.findElement(By.id("products-orderby"));
			sel=new Select(ele);
			sel.selectByIndex(i);
		}
	}
}
