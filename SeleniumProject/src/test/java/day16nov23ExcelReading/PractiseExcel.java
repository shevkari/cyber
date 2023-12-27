package day16nov23ExcelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PractiseExcel {

	public static void main(String[] args)  throws IOException{

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/WC2023.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("WC23");
		
		int row = sheet.getLastRowNum();
		int col  =sheet.getRow(0).getLastCellNum();
		
		System.out.println(row+" "+col);
		
		Object[][] ObjArr = new Object[row][col];
		
		for(int i=1; i<=row; i++)
		{
			for(int j=0; j<col; j++)
			{
				String val = sheet.getRow(i).getCell(j).getStringCellValue();
				ObjArr[i-1][j] = val;
			}
		}
		
		
		for(int r=0; r<ObjArr.length; r++)
		{
			for(int c=0; c<ObjArr[r].length; c++)
			{
				System.out.print(String.format("%-10s", ObjArr[r][c]));
			}
			System.out.println();
		}
		
		fis.close();
	}

}