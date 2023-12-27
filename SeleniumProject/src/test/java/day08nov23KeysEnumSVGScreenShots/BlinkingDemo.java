package day08nov23KeysEnumSVGScreenShots;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkingDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//div//a[@role='button'])[2]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 10px solid yellow;');",firstName);
		firstName.sendKeys("Cyber");
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 1px solid grey;');", firstName);

		
		WebElement lastName = driver.findElement(By.name("lastname"));
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 10px solid yellow;');",lastName);
		lastName.sendKeys("Success");
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 1px solid grey;');", lastName);

		WebElement mail = driver.findElement(By.name("reg_email__"));
		js.executeScript("arguments[0].setAttribute('style', 'background:red; border: 10px slod yellow;');", mail);
		mail.sendKeys("CyberSuccess.gmail.com");
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 1px solid grey;');", mail);
	
		
		
	}

}
