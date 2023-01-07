package POM_DDF_TESTNG_BaseNUtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 



{
	
		public static void captureSS(WebDriver driver, int TCID) throws IOException
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\hp\\Documents\\Sample\\testcase"+TCID+"jpg");
			FileHandler.copy(src, dest);
		}
	
	    //this method is use to capture screenshot on webpage
		//need to pass 2 inputs:  1.webDriver object   2.TCID
		//Author Name: @Priyanka
	public static String getTD(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\Desktop\\DDF1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	/*public static String getTD(int rowIndex, int cellIndex,String Sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\Desktop\\DDF1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheetname");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}*/

}
