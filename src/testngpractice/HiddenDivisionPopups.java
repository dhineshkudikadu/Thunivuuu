package testngpractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenDivisionPopups 
{
	@Test
	public void hiddenDuv()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://smallpdf.com/word-to-pdf");
		File file=new File("./Screenshot.second/workbookData.xlsx");
		String path=file.getAbsolutePath();
		System.out.println(path);
		//driver.findElement(By.xpath("//span[@role='button']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).sendKeys(path);
		
	}

}
