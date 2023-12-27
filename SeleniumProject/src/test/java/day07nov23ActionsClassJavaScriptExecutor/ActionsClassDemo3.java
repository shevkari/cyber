package day07nov23ActionsClassJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo3 {
	public static void main(String[] args) { 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//div//li/a)[50]")).click();
		
		//Actions action = new Actions(driver);
	//	action.moveToElement(ele).click().build().perform();
		
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		WebElement ele1 = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
	//	action.moveToElement(ele).clickAndHold().moveToElement(ele1).release().build().perform();
		action.dragAndDrop(ele, ele1).build().perform();
		}
}
