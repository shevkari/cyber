package day20nov23ExtendReportShadowEle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowEleDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		SearchContext sc = driver.findElement(By.tagName("shop-app")).getShadowRoot();
		sc.findElement(By.cssSelector("a[href='/list/mens_outerwear']")).click();
		sc.findElement(By.cssSelector("a[href='/list/ladies_outerwear']")).click();
		sc.findElement(By.cssSelector("a[href='/list/mens_tshirts']")).click();
		sc.findElement(By.cssSelector("a[href='/list/ladies_tshirts']")).click();
	//	sc.findElement(By.cssSelector("paper-icon-button[icon='shopping-cart']")).click();
		
		sc.findElement(By.cssSelector("div[class='demo-label']")).click();

		
	}

}
