package testngpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_Chrome 
{
//	@Test(groups="smoke")
//	public static void regis()
//	{
//		System.out.println("id registered");
//	}
//	@Test(groups="regrestion")
//	public static void login()
//	{
//		System.out.println("id login successfully");
//	}
//	@Test(groups="functional")
//	public static void delete()
//	{
//		System.out.println("id deleted");
//	}

//	@Test
//	public static void practice() throws InterruptedException, IOException
//	{
//		FileInputStream fi=new FileInputStream("./Data/Propertyfile/DataDrivenProperties.txt");
//		Properties b=new Properties();
//		b.load(fi);
//		String url=b.getProperty("url");
//		System.out.println(url);
//		FileInputStream fis=new FileInputStream("./Data/ExcelFile/workbookData.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		
//		wb.getSheet("Dine").getRow(0).getCell(0).setCellValue("hello");
//		FileOutputStream fout= new FileOutputStream("./Data/ExcelFile/workbookData.xlsx");
//		String value=wb.getSheet("Dine").getRow(0).getCell(0).getStringCellValue();
//		int row=wb.getSheet("Dine").getPhysicalNumberOfRows();
//		System.out.println(row);
//		System.out.println(value);
//		wb.write(fout);
//		wb.close();
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		String title=driver.getTitle();
//		System.out.println(title);
//		String actualResult="Online Shopping";
//		if (title.contains(actualResult)) 
//		{
//			System.out.println("boolean True");
//		}
//		driver.close();
//		String currentUrl=driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		String url="https://www.flipkart.com/";
//		if (url.equals(currentUrl)) 
//		{
//			System.out.println("boolean True");
//			
//		} else 
//		{
//			System.out.println("boolean false");
//		}
//		String sourceCode=driver.getPageSource();
//		System.out.println(sourceCode);
//		Reporter.log(sourceCode);
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
//		Set<String> windowID=driver.getWindowHandles();
//		int size=windowID.size();
//		System.out.println(size);
//		for (String wID : windowID) 
//		{
//			System.out.println(wID);
//			String str2=driver.getTitle();
//			System.out.println(str2);
//			
//		}
//		//System.out.println(windowID);
//		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'New to Flipkart? Create an account')]")).click();
//		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("6380954619");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'CONTINUE')]")).click();
//		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("6380954619");
//		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
//		driver.findElement(By.id("pMuryQskSqxiWzy")).click();
//		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
//		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("dineash");
//		WebElement screen=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		
//		File fil=screen.getScreenshotAs(OutputType.FILE);
//		File fil2=new File("./Data/Screenshot/new.png");
//		FileHandler.copy(fil, fil2);
//		driver.findElement(By.xpath("(//input[@data-type=\"text\"])[2]")).sendKeys("5664454");
//		Thread.sleep(2000);
//		String getText=driver.findElement(By.xpath("(//input[@data-type=\"text\"])[2]")).getAttribute("type");
//		Thread.sleep(2000);
//		String expectedText="text";
//		if (expectedText.equals(getText))
//		{
//			System.out.println(getText+" is true");
//			
//		} else {
//			System.out.println(getText+" is false");
//
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("5454464564");
//		Thread.sleep(2000);
//		Point size=driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).getLocation();
//		System.out.println(size);
//		WebElement day=driver.findElement(By.id("day"));
//		WebElement month=driver.findElement(By.name("birthday_month"));
//		Select sel=new Select(day);
//		sel.selectByIndex(0);
//		sel=new Select(month);
//		sel.selectByVisibleText("Jan");
//		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("dbfhbhbsdhbc");
//		Thread.sleep(2000);
//		//driver.quit();
//	}
//
	@Test
	public void workingWithPopups() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK')])[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Robot r	=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		Set<String> windowID=driver.getWindowHandles();
		for (String windowIDS : windowID) 
		{
			System.out.println(windowIDS);
		}
		Iterator<String> it=windowID.iterator();
		
		String parentId=(String) it.next();
		System.out.println(parentId);
		String str2=(String) it.next();
		System.out.println(str2);
		
		driver.switchTo().window(str2);
		driver.get("https://www.flipkart.com/");
//		driver.quit();
	
	}
}
