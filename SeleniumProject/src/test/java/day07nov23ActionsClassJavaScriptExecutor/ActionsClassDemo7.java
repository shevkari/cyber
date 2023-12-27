package day07nov23ActionsClassJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo7 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//li/a[text()='Slider']")).click();
		
		driver.switchTo().frame(0);
		WebElement ele =driver.findElement(By.xpath("//div/span"));
		
		Actions action = new Actions(driver);
		
//		action.moveToElement(ele).clickAndHold().moveByOffset(100,0).release().build().perform();
//		action.moveToElement(ele).clickAndHold().moveByOffset(-50,0).release().build().perform();

		action.dragAndDropBy(ele, 100, 0).build().perform();
		driver.quit();
	}

}
