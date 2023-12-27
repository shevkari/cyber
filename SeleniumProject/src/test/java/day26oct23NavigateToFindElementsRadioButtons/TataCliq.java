package day26oct23NavigateToFindElementsRadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TataCliq {

	public static void main(String[] args) {

		String url = "https://www.tatacliq.com";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		driver.findElement(By.id("categories")).click();
		
	}

}
