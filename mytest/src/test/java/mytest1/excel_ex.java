package mytest1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_ex 
{
	public static void main(String[] args) throws IOException 
	{
		String pr = System.getProperty("user.dir");
		XSSFWorkbook workbook = new XSSFWorkbook(pr+"/excel/Untitled 1.ods");
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int x =sheet.getPhysicalNumberOfRows();
		System.out.println(x);
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
	}
}
