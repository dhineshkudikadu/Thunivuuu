package testngpractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelDataRead 
{
	@Test
	public void excelData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Screenshot.second/workbookData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String value=wb.getSheet("Sheet1").getRow(2).getCell(2).toString();
		System.out.println(value);
		
	}

}
