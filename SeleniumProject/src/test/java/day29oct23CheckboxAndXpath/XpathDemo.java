package day29oct23CheckboxAndXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Cyber Success");
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Cyber Success 2");
	//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("amol dada");
	//	driver.findElement(By.xpath("//input[@class='form-control form-control-sm form-control-lg form-control-md']")).sendKeys("amol");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/fieldset/p/input[@id='username']")).sendKeys("ABC");
	//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/fieldset/p/input[1]")).sendKeys("ABC")
;
	Thread.sleep(2000l);

	driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/fieldset/p/input[@id='password']")).sendKeys("CAHS");
	Thread.sleep(2000l);
//	driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/fieldset/p/i[@id='togglePassword']")).click();
	
	driver.findElement(By.xpath("//i[@id='togglePassword']")).click();
	
	driver.findElement(By.xpath("//li[@id='Isolation Ward']")).click();
	
//	driver.findElement(By.xpath("//input[@id='loginButton']")).click();
	
	}

}
