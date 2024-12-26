package testngpractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopups 
{
	@Test
	public void fileUpload()
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://smallpdf.com/word-to-pdf");
		File file=new File("./Data/Propertyfile/DataDrivenProperties.txt");
		File path=file.getAbsoluteFile();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div/label/div/div[2]/form/label/div/div[2]/button[2]"));
		
	}
}
