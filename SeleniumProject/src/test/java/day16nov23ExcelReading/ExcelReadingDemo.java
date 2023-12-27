package day16nov23ExcelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/PlayerData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("PlayerInfo");
		
		
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
	
		System.out.println(row);
		System.out.println(col);
		
		String[][] str = new String[row][col];
		
		for(int r=1; r<=row; r++ )
		{
			for(int c=0; c<col; c++)
			{
				String val = sheet.getRow(r).getCell(c).getStringCellValue();
				
				str[r-1][c] = val;
			}
		}
		
		for(int i =0; i<str.length; i++)
		{
			for(int j=0; j<str[i].length; j++)
			{
				System.out.print(str[i][j]+"\t");
			}
			System.out.println();

		}
		
		fis.close();
	}

}
