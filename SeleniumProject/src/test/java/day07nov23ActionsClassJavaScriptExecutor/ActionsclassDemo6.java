package day07nov23ActionsClassJavaScriptExecutor;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsclassDemo6 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele = driver.findElement(By.xpath("(//p[@align='center'])[2]//img"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(ele).contextClick().build().perform();
		
		WebElement pro = driver.findElement(By.id("dm2m1i1tdT"));
		pro.click();
		WebElement insta = driver.findElement(By.id("dm2m2i1tdT"));
		insta.click();
		WebElement HtoSet = driver.findElement(By.id("dm2m3i1tdT"));
		HtoSet.click();
		
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		String pWind = iter.next();
		String cWind = iter.next();
		
		System.out.println(pWind + ": :" + cWind);
		
		driver.switchTo().window(cWind);
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		driver.quit();
	
	}
	

}
