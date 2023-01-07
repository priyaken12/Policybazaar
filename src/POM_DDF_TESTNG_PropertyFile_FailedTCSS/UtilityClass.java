package POM_DDF_TESTNG_PropertyFile_FailedTCSS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 

{
	 public static String ReadPRopFdata(String key) throws IOException
	 {
		 FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium_3\\propertyFile.properties");
		 Properties p= new Properties();
		 p.load(file);
		 
		 String value = p.getProperty(key);
		 return value;
	 }	
	    //this method is use to capture screenshot on webpage
		//need to pass 2 inputs:  1.webDriver object   2.TCID
		//Author Name: @Priyanka
	public static String getTD(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium_3\\TestData\\DDF1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	
	 public static void captureSS(WebDriver driver, int TCID) throws IOException
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\hp\\eclipse-workspace\\Selenium_3\\Screenshots"+ TCID +".jpg");
			FileHandler.copy(src, dest);
		}
	
	

}
