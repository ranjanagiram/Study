package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("C:\\Users\\Ranjana\\Desktop\\velocity\\Automation\\exceltest1.xlsx");
		Sheet Sheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		for(int i=0;i<=5;i++)
		{
			String value;
			
		 value = Sheet.getRow(i).getCell(0).getStringCellValue();
		 System.out.print(value+" ");
		}
		System.out.println();
//		for(int i=0;i<=4;i++)
//		{
//			String value = Sheet.getRow(0).getCell(i).getStringCellValue();
//			System.out.println(value+" ");
//		}
//		//to get last row number
		int lastRownumsize = Sheet.getLastRowNum();
		System.out.println(lastRownumsize);
		short lastcolumn = Sheet.getRow(0).getLastCellNum();
		int lastcolumnsize = lastcolumn-1;
		System.out.println(lastcolumnsize);
		

	
			}

}

