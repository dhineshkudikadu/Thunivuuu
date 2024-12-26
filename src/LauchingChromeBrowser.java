import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LauchingChromeBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
	//	driver.findElement(By.id("email")).sendKeys("dhineshraja0205@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("dhineh0205");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Lavadi");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("kabal");
		driver.findElement(By.name("reg_email__")).sendKeys("6380954619");
		driver.findElement(By.id("password_step_input")).sendKeys("6380");
		
	}

}
 