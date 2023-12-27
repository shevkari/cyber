package day26oct23NavigateToFindElementsRadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsdemo {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.letskodeit.com/practice";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		List <WebElement> element =driver.findElements(By.xpath("//input[@type='radio']"));
	
		/*
		for(WebElement x : element)
		{
			System.out.println("radio btn status: " + x.isSelected()); // false
			x.click();
			System.out.println("radio btn status: " + x.isSelected()); // true
			Thread.sleep(4000l);
		}
		*/
		
		for (int i=0; i<element.size(); i++)
		{
			element.get(i).click();
			Thread.sleep(4000l);
				
		}
		driver.close();	
		
	}

}
