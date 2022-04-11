package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//create an object of fileinputstream along with by giving path name and extension
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Ranjana\\Desktop\\velocity\\Automation\\exceltest1.xlsx");
//	String value = WorkbookFactory.create(MyFile, "MyFile").getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//	System.out.println(value);
	WorkbookFactory workbookFactory;
	//workbookfactory will return weateorkbook
	Workbook test1 = WorkbookFactory.create(MyFile);
	//getSheet will return sheet
	Sheet mysheet = test1.getSheet("Sheet1");
	String v1 = mysheet.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(v1);
	
	

	}

}
