package day02nov23ValueAttributeWebTableAlertsendKeysOpernTab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo1 {

	public static void main(String[] args) {

		String str = "http://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(str);
		
		List<WebElement> wE = driver.findElements(By.xpath("//tr[1]/th"));
		for (WebElement x : wE) 
		System.out.print(String.format("%-32s", x.getText()));	
		int cnt =2;
		while(cnt<=4)
			{
		wE = driver.findElements(By.xpath("//tr["+ cnt +"]/td"));
		System.out.println();
		for (WebElement x: wE) 
			System.out.print(String.format("%-32s", x.getText()));
		cnt++;
			System.out.println();
			}
			
		
		driver.close();
	}

}
