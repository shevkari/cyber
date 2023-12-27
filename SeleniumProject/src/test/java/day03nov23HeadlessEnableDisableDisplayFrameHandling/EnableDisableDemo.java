package day03nov23HeadlessEnableDisableDisplayFrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("enabled-example-input"));
		System.out.println(ele.isEnabled());
		ele.sendKeys("Cyber");
		driver.findElement(By.id("disabled-button")).click();
		System.out.println(ele.isEnabled());
		
		driver.findElement(By.id("enabled-button")).click();
		System.out.println(ele.isEnabled());
	}

}
