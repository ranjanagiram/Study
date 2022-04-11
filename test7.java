package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Ranjana\\Desktop\\velocity\\Automation\\exceltest1.xlsx");
           Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet5");
           int rowsize = sheet.getLastRowNum();
           System.out.println("rowsize: "+rowsize);
           int cellsize = sheet.getRow(0).getLastCellNum()-1;
           System.out.println("cellsize: "+cellsize);
           for(int i=0;i<=rowsize;i++)
           {
           	for(int j=0;j<=cellsize;j++)
           	{
           		Cell data = sheet.getRow(i).getCell(j);//data present at that location/cell
           		CellType type = data.getCellType();//type...string/numeric/boolean
           		if(type==CellType.STRING)
           		{
           			String value = data.getStringCellValue();
           			System.out.print(value+" ");
           			
           		}
           		
           		
           		else if(type==CellType.NUMERIC)
           		{
           			double value = data.getNumericCellValue();
           			System.out.print(value+" ");
           			//System.out.println();
           		}
           	
           		else if(type==CellType.BOOLEAN)
           		{
           			boolean value = data.getBooleanCellValue();
           			System.out.print(value+" "); 
           			
           			//System.out.println();
           		}
//           		else if(type==CellType.BLANK)
//           		{
//           			data.removeCellComment(;
//           			System.out.println();
//           		}
           		
           		
           	}
           }
	}
	}


