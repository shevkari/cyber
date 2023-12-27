package day31oct23Tagname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		
		List <WebElement> low = driver.findElements(By.tagName("li"));
		int cnt = 1;
		for (WebElement ele : low) 
			System.out.println(cnt++ +" : " + ele.getText());
		
	}

}
