package testngpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile 
{
	@Test
	public void property() throws IOException
	{
		FileInputStream fis=new FileInputStream("./Data/Propertyfile/DataDrivenProperties.txt");
		Properties po=new Properties();
		po.load(fis);
		String	url=po.getProperty("url");
		System.out.println(url);
	}

}
