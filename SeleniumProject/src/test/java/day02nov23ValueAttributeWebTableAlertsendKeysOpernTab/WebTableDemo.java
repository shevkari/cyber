package day02nov23ValueAttributeWebTableAlertsendKeysOpernTab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {

		String str = "http://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(str);
		
		List<WebElement> loe = driver.findElements(By.id("product"));
		for (WebElement x :  loe)
			System.out.print(String.format("%-32s", x.getText()));
	}

}
