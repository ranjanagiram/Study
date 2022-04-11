package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Ranjana\\Desktop\\velocity\\Automation\\exceltest1.xlsx");
		 Sheet v2 = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		String value1 = v2.getRow(0).getCell(0).getStringCellValue();
		String value2 = v2.getRow(1).getCell(0).getStringCellValue();
	    String value3 = v2.getRow(2).getCell(0).getStringCellValue();
		                 
System.out.println(value1);
System.out.println(value2);
System.out.println(value3);
}
}
