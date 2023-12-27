package day06non23WaitsNewWindow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbExcerciseDoneBySir {

	static WebDriver driver;
	
	static void enterValue(By Field, String value)
	{
		driver.findElement(Field).sendKeys(value);
	}
	
	static void selectBtn(By path)
	{
		
		driver.findElement(path).click();
		
		
	}
	
	
	static void selectBtn3(By path)
	{
		
		driver.findElement(path).click();
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div/a[starts-with(@id,'u_0_0_')]")).click();
		
		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		
//		driver.findElement(By.name("firstname")).sendKeys("ABC");
//		driver.findElement(By.name("lastname")).sendKeys("ABC");
//		WebElement ele = driver.findElement(By.name("reg_email__"));
		String mail ="1234567892"; 
//		ele.sendKeys(mail);
/*		Thread.sleep(2000l);
		if(ele.getText().contains("@gmail.com"));
		{
			System.out.println(ele.getText());
			
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(mail);
		}
*/	
//		driver.findElement(By.name("reg_passwd__")).sendKeys("ABC");
	
		
		
		enterValue(By.name("firstname"),("ABC"));
		enterValue(By.name("lastname"),("ABC"));
		enterValue(By.name("reg_email__"),(mail));
		enterValue(By.name("reg_passwd__"),("ABC"));
		enterValue(By.name("birthday_day"),("03"));
		enterValue(By.name("birthday_month"),("feb"));
		enterValue(By.name("birthday_year"),("1994"));
		int val=-1;
	//	driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	//	driver.findElement(By.xpath("(//label[@class='_58mt'])["+ cnt +"]"));
		if(val==-1)
		{
			selectBtn3(By.xpath("//label[@class='_58mt'])["+ val +"]"));
		}
		else
		{
		selectBtn(By.xpath("(//label[@class='_58mt'])["+ val +"]"));
		}
		
	driver.close();
	}

}
