package day31oct23Tagname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement ele  = driver.findElement(By.id("multiple-select-example"));
		
		Select select = new Select(ele);
		System.out.println(select.isMultiple());
		
		select.selectByIndex(1);
		select.selectByIndex(2);
		
		List<WebElement> lw =select.getAllSelectedOptions();
		for(WebElement x : lw)
			System.out.println(x.getText());
		Thread.sleep(2000l);
		select.deselectByIndex(1);
		select.deselectByIndex(2);
	
	
	}

}
