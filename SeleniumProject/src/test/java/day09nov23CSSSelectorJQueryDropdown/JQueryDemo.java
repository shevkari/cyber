package day09nov23CSSSelectorJQueryDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox1")).click();
		
		List<WebElement> low = driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])[2]//span[@class='comboTreeItemTitle']"));
		for(WebElement ele : low) {
			System.out.println(ele.getText()) ;
			if(ele.getText().equals("choice 3"))
				ele.click();
		}
	}

}
