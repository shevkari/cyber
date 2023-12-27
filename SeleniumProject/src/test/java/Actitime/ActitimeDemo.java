package Actitime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitimeDemo {

	static WebDriver driver;
	
	private static void onLoginpage(By by, String str)
	{
		driver.findElement(by).sendKeys(str);
		
	}
	
	
	private static void clickable(By by)
	{
		driver.findElement(by).click();
	}
	
	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("http://desktop-calvdqi:82/login.do");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
	//	driver.findElement(By.name("username")).sendKeys("admin");
	//	driver.findElement(By.name("pwd")).sendKeys("manager");
		
		onLoginpage(By.name("username"), ("admin"));
		onLoginpage(By.name("pwd"), ("manager"));
		
	//	driver.findElement(By.id("loginButton")).click();
		
	//	driver.findElement(By.xpath("//a[@class='content users']")).click();
	//	driver.findElement(By.xpath("(//span[@unselectable='on'])[1]")).click();
		
		clickable(By.id("loginButton"));
		clickable(By.xpath("//a[@class='content users']"));
		clickable(By.xpath("(//span[@unselectable='on'])[1]"));
		
	//	driver.findElement(By.name("username")).sendKeys("Shiva");
	//	driver.findElement(By.name("passwordText")).sendKeys("shiva123");
	//	driver.findElement(By.name("passwordTextRetype")).sendKeys("shiva123");
		
		onLoginpage(By.name("username"), ("shiva"));
		onLoginpage(By.name("passwordText"), ("shiva123"));
		onLoginpage(By.name("passwordTextRetype"), ("shiva123"));

		onLoginpage(By.name("firstName"), ("Shivansh"));
		onLoginpage(By.name("middleName"), ("Amol"));
		onLoginpage(By.name("lastName"), ("Shevkari"));
		onLoginpage(By.name("email"), ("Shiva...Shevkari@gmail.com"));
		
		WebElement ele = driver.findElement(By.name("userGroupId"));
		ele.click();
		
//		clickable(By.name("userGroupId"));
		
		
//		driver.findElement(By.xpath("((//select)[2]/option)[4]")).click();
		
//		clickable(By.xpath("((//select)[2]/option)[4]"));
		

		Select sel = new Select(ele);
		sel.selectByIndex(4);
		
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		clickable(By.cssSelector("input[type='submit']"));

		
	}

}
