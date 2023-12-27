package day03nov23HeadlessEnableDisableDisplayFrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcersiceFaceBookAcc {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0_')]"));
		ele.click();
		Thread.sleep(4000l);

		String email = "XYZ@gmail.com";
	driver.findElement(By.name("firstname")).sendKeys("XYZ");
	driver.findElement(By.name("lastname")).sendKeys("XYZ");
	WebElement ELE = driver.findElement(By.name("reg_email__"));
	ELE.sendKeys(email);
	Thread.sleep(2000l);
	
//	if(str.equals(email))
//		driver.findElement(By.xpath("//input[starts-with(@id,'u_2_j_')]")).sendKeys(email);
	driver.findElement(By.id("password_step_input")).sendKeys("XYZ");
	driver.findElement(By.xpath("//select[@id='month']")).sendKeys("feb");
	Thread.sleep(2000l);
	driver.findElement(By.xpath("//select[@id='day']")).sendKeys("1");
	driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1994");
	
	int cnt = -1;
	if(cnt<0) {
		driver.findElement(By.xpath("//input[@value='"+cnt+"']")).click();
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//select)[4]/option[4]")).click();
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("Male");
		Thread.sleep(2000l);
	}
	else
		driver.findElement(By.xpath("//input[@value='"+cnt+"']")).click();

	
	driver.findElement(By.xpath("//input[starts-with(@id,'u_2_j_')]")).sendKeys(email);
	Thread.sleep(2000l);
	driver.findElement(By.xpath("(//button[contains(@id,'u_')])[2]")).click();
	Thread.sleep(25000l);

	driver.close();
	
	
	
	}
}
