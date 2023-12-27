package day30oct23XpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialLinkText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
	//		// a: anchor tag
		
	//	driver.findElement(By.linkText("SIGN IN")).click();
		
	//	driver.findElement(By.partialLinkText("SIGN")).click();
		
		driver.findElement(By.className("btn-style class1")).click();
	}

}