package day30oct23XpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxex {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@id='username']/parent::p/following-sibling::ul/child::li)[6]/ancestor::form/descendant::input[@id='username']")).sendKeys("Xpath Axes");

		
	}

}
