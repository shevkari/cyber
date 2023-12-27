package day06non23WaitsNewWindow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.cm");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Facebook");
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(5));
		wait.pollingEvery(Duration.ofMillis(800));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='wM6W7d'])[8]")));
		
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement ele = driver.findElement(By.xpath("(//div[@class='wM6W7d'])[8]"));
		ele.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")));

		List<WebElement> el = driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		System.out.println(el.size());
		for(WebElement x:el)
		{
			System.out.println(x.getText());
			ele = driver.findElement(By.xpath("//h3"));
			x.click();
			
			driver.navigate().back();
		}
		driver.quit();
	}

};
