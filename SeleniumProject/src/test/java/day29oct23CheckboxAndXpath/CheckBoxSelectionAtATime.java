package day29oct23CheckboxAndXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelectionAtATime {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
	
		driver.manage().window().maximize();
		
	List<WebElement> ele=	driver.findElements(By.xpath("//input[@name='cars'][@type='checkbox']"));
		
/*	for(WebElement x : ele)
	{
		x.click();
	}
*/
	for(int i=0; i<ele.size(); i++)
	{
	System.out.println(	ele.get(i).isSelected());
	ele.get(i).click();	
	System.out.println(	ele.get(i).isSelected());

	}
	
	}

}
