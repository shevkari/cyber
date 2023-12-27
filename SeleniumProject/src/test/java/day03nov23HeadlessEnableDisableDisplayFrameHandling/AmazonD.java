package day03nov23HeadlessEnableDisableDisplayFrameHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonD {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> low = driver.findElements(By.id("nav-xshop-container"));
		System.out.println(low.size());
		for (WebElement x : low) {
			System.out.println(x.getText());
			x.click();
			Thread.sleep(2000l);
			driver.navigate().back();
		}
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).click();
		driver.navigate().back();
		Thread.sleep(2000l);
		driver.close();
	}
}
