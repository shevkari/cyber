package day03nov23HeadlessEnableDisableDisplayFrameHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessDemo {

	public static void main(String[] args) {

	//	ChromeOptions option = new ChromeOptions();
	//	EdgeOptions option = new EdgeOptions();
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--headless");
	//	WebDriver driver = new ChromeDriver(option);
	//	WebDriver driver = new EdgeDriver(option);
		WebDriver driver = new FirefoxDriver(option);
		
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
