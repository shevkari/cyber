package day07nov23ActionsClassJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//li/a[text()='Droppable']")).click();
		
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		WebElement ele2 = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
	//	action.clickAndHold(ele).moveToElement(ele2).release().build().perform();
		action.clickAndHold(ele).moveToElement(ele2, 50, 100).release().build().perform();
		driver.quit();
	}

}
