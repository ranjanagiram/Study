package excelSheet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Ranjana\\Desktop\\velocity\\Automation\\exceltest1.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		int rowsize = MySheet.getLastRowNum();
		short column = MySheet.getRow(0).getLastCellNum();
		int columnsize = column-1;
		System.out.println(rowsize+" this is row size"); 
		System.out.println(columnsize+" this is columnsize");
		//outer loop for row
		for(int i=0;i<=rowsize;i++)
		{
			//inner for loop for column
			for(int j=0;j<=columnsize;j++)
			{
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		

	}

}
