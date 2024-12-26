package testngpractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataWrite 
{
@Test
public void Write1() throws EncryptedDocumentException, IOException
{
//	WebDriverManager.chromedriver().setup();
//	ChromeDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	FileInputStream fis=new FileInputStream("./Screenshot.second/workbookData.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("hello");
	
	
	
	FileOutputStream go=new FileOutputStream("./Screenshot.second/workbookData.xlsx");
	wb.write(go);
	wb.close();
	
}
}
