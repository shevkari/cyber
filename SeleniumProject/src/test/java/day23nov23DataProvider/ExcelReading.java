package day23nov23DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReading {

	@Test(dataProvider="getValue")
	public void Login(HashMap<String,String> map)
	{
		System.out.println("login with details : UN--> " + map.get("name") + " pwd--> " + map.get("pwd") + " age--> " + map.get("age") );
	}
	
	@DataProvider
	public Object[] getValue() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/day23nov23DataProvider/cricketer.xlsx");
	
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("PlayerInfo");
		
		int row = sheet.getLastRowNum();
		
		String header1 = sheet.getRow(0).getCell(0).getStringCellValue();
		String header2 = sheet.getRow(0).getCell(1).getStringCellValue();
		String header3 = sheet.getRow(0).getCell(2).getStringCellValue();
		
		Object[] data = new Object[row];
		
		for(int i=0; i<row; i++)
		{
			Map<String,String> map = new HashMap<>();
			
			String value1 = sheet.getRow(i+1).getCell(0).getStringCellValue();
			String value2 = sheet.getRow(i+1).getCell(1).getStringCellValue();
			String value3 = sheet.getRow(i+1).getCell(2).getStringCellValue();
			
			map.put(header1, value1);
			map.put(header2, value2);
			map.put(header3, value3);
			
			data[i] = map;
		}
	
		return data;
	}

}
