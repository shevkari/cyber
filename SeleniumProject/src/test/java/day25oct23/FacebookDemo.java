package day25oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		WebElement element =driver.findElement(By.id("email"));
		element.clear();
		element.sendKeys("shevkariamol19@gmail.com");
		Thread.sleep(2000l);
		element = driver.findElement(By.id("pass"));
		element.sendKeys("Ak@ndcompany");
		Thread.sleep(2000l);
		element = driver.findElement(By.name("login"));
		element.click();
	}

}
