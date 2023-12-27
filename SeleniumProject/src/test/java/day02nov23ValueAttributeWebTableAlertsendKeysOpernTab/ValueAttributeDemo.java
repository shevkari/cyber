package day02nov23ValueAttributeWebTableAlertsendKeysOpernTab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueAttributeDemo {

	public static void main(String[] args) {

		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		String w = "Cyber";
		String x = "Success";
		String y = "Deccan";
		String z = "Pune";
		
		
		WebElement txtbox = driver.findElement(By.id("name"));
		
		txtbox.sendKeys(w,x,y,z);
		
		String val = txtbox.getAttribute("value");
		System.out.println(val);
		
		driver.close();
	}

}
