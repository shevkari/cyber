package day02nov23ValueAttributeWebTableAlertsendKeysOpernTab;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		String msg = "Cyber";
		WebElement ele = driver.findElement(By.id("name"));
		ele.sendKeys(msg);
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000l);
		String strtxt = alt.getText();
		String strMsg = "Hello " + msg + ", share this practice page and share your knowledge";

		
		alt.accept();

//		System.out.println(strtxt +" :" + strMsg);
		if(ele.getText().isEmpty() && strtxt.equals(strMsg))
			System.out.println("Alert Passed");
		else
			System.out.println("Alert failed");
		
			}
	

}
