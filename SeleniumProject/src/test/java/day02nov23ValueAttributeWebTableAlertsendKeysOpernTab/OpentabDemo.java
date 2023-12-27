package day02nov23ValueAttributeWebTableAlertsendKeysOpernTab;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpentabDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("opentab")).click();
		
		Set<String> swh =  driver.getWindowHandles();
		
		Iterator<String> strI = swh.iterator();
		
		String ogrURL = strI.next();
		String nextwURL  = strI.next();
		System.out.println(nextwURL);
	
		driver.switchTo().window(nextwURL);
		Thread.sleep(2000l);
		String expURL = driver.getCurrentUrl();
		String ActURL = "https://www.letskodeit.com/courses";
		if(expURL.equals(ActURL))
			System.out.println("Link open tab Working");
		else
			System.out.println("Link open tab NOT Working");
		driver.close();
		driver.switchTo().window(ogrURL);
		Thread.sleep(2000l);
		driver.close();		
	}

}

