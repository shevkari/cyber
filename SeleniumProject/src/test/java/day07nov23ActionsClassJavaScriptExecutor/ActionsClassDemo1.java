package day07nov23ActionsClassJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();    
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele = driver.findElement(By.id("autosuggest"));
		
		Actions action = new Actions(driver);
//		action.moveToElement(ele).click().sendKeys("xyz").build().perform();
	
		action.sendKeys(ele, "yyzz").build().perform();
		
		WebElement wele = driver.findElement(By.id("openwindow"));
		action.click(wele).build().perform();
		driver.quit();
		
	}

}
