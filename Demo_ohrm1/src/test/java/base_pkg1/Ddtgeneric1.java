package base_pkg1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ddtgeneric1 
{
	public static String ddt1(String sheet, int row, int cell)
	{
		String value=null;
		String path="C:\\Users\\PC\\Desktop\\DDT1.xlsx";
		
		try
		{
			FileInputStream fis= new FileInputStream(path); //File path capture
			Workbook book = WorkbookFactory.create(fis); //create file session
			value= book.getSheet(sheet).getRow(row).getCell(cell).toString();
			
		}
		catch (Exception e) 
		{
			System.out.println("File not found");
		}
		
		return value;
		
	}
}
