package day07nov23ActionsClassJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);", "");
		
		
		WebElement ele =driver.findElement(By.id("mousehover"));
		
			Actions action = new Actions(driver);
			action.moveToElement(ele).click().build().perform();
			
			WebElement ele1 = driver.findElement(By.xpath("//a[@href='#top']"));
			action.moveToElement(ele1).click().build().perform();
			Thread.sleep(3000l);
			
			action.moveToElement(ele).click().build().perform();
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Reload']"));
		action.moveToElement(ele2).click().build().perform();
			driver.quit();
	}

}
