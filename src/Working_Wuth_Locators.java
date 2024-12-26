import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class Working_Wuth_Locators {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("hellomoto@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pooda0123");
		driver.findElement(By.className("_9lsa")).click();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("shjdgwhj");
		driver.findElement(By.name("lastname")).sendKeys("rock");
		driver.findElement(By.name("reg_email__")).sendKeys("rock@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("rock@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hdds");
		WebElement day=driver.findElement(By.id("day"));
		Select sel=new Select(day);
		sel.isMultiple();
	}

}











/*WebElement day=driver.findElement(By.id("day"));
Select sel=new Select(day);
sel.selectByIndex(3);
WebElement month=driver.findElement(By.id("month"));
sel=new Select(month);
sel.selectByVisibleText("May");
System.out.println("sel.selectByVisibleText(\"11\");");
WebElement year=driver.findElement(By.id("year"));
sel=new Select(year);
List<WebElement> eles = sel.getOptions();
System.out.println(eles.toString());*/
