package day03nov23HeadlessEnableDisableDisplayFrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement dspbox = driver.findElement(By.id("displayed-text"));
		dspbox.sendKeys("Cyber");
		System.out.println(dspbox.isDisplayed());
		Thread.sleep(2000l);
		WebElement hdebtn = driver.findElement(By.id("hide-textbox"));
		hdebtn.click();
		System.out.println(hdebtn.isEnabled());
		
		Thread.sleep(3000l);
		WebElement shwbtn = driver.findElement(By.id("show-textbox"));
		shwbtn.click();
		System.out.println(shwbtn.isEnabled());

		driver.close();
		
	}

}
