package day25oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysDemo {

	private static void enterInput(WebElement element, String str ) {
		
		element.clear();
		element.sendKeys(str);
	}
	
	private static void enterInputs(WebElement element, Boolean hasErase, String... str)
	{
		if (hasErase)
			element.clear();
		for(String st : str)
		element.sendKeys(st);
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement webele = driver.findElement(By.id("autosuggest"));
		/*
		
		webele.clear();
		webele.sendKeys("Amol");
		Thread.sleep(2000l);
		webele.sendKeys("Shevkari");
		//driver.close();
		
		*/
		
		
		enterInput(webele, "Amol Dada");
		Thread.sleep(2000l);
		enterInputs(webele, true, "Amol", " Shevkari", " Navlakh ","Umbre");
	}

}
