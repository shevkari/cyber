package day09nov23CSSSelectorJQueryDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownDemo {

	public static void main(String[] args)  {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement> low= driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//span[@class='comboTreeItemTitle']"));
		System.out.println(low.size());
		
		for (WebElement ele : low) {
			System.out.println(ele.getText());
			if(ele.getText().equals("choice 2 1") || ele.getText().equals("choice 6 2 1"))
				ele.click();
		}
	}

}
