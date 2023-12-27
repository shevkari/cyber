package day31oct23Tagname;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement low = driver.findElement(By.id("carselect"));
		
		Select sel = new Select(low);
		
		System.out.println(sel.isMultiple());
		
	//	sel.selectByIndex(1);
	//	sel.selectByValue("honda");
	//	sel.selectByVisibleText("Benz");
	
	
		List<WebElement> web = driver.findElements(By.id("carselect"));
		
		ListIterator<WebElement> lis = web.listIterator();
		while(lis.hasNext())
			low = lis.next();
		System.out.println(low.getText());
		
		web = sel.getOptions();
		System.out.println(web.size());
		
		for (WebElement x : web) {
			System.out.println(x.getText());
		}
		
	}

}
