package day06non23WaitsNewWindow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Facebook");
		
		//Explicit Wait - WebDriver Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='wM6W7d'])[2]")));
		
		
		// Implicit Wait / Global Wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//	WebElement ele = driver.findElement(By.xpath("(//div[@class='wM6W7d'])[2]"));
		System.out.println(ele.getText());
		ele.click();

		ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")));
		
		List<WebElement> el = driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		System.out.println(el.size());
		for(WebElement x:el)
		{
			//System.out.println(x.getText());
		System.out.println(driver.getCurrentUrl());
			el = driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
			x.click();

			driver.navigate().back();			
			
		}
		driver.navigate().back();
		driver.quit();
	}
}
