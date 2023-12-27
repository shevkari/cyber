package day02nov23ValueAttributeWebTableAlertsendKeysOpernTab;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		String str ="Cyber";
		driver.findElement(By.id("name")).sendKeys(str);
		
		
		
		WebElement ele =driver.findElement(By.id("confirmbtn"));
		ele.click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000l);
//		alt.accept();
	
		alt.dismiss();
		
		
	}

}
