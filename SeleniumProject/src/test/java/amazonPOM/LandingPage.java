package amazonPOM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	
	LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	private By selectedIphone = By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
	private By buy = By.id("submit.buy-now");
	private By details = By.id("ap_email");
	private By Continue = By.id("continue");
	private By password = By.id("ap_password");
	By clBtn = By.id("signInSubmit");
	
	private LandingPage selectPhone() 
	{
		driver.findElement(selectedIphone).click();
		return this;

	}
	
	private LandingPage buyItem()
	
	{
		
		Set<String> windoids = driver.getWindowHandles();	
		
		Iterator<String> iter = windoids.iterator();
		String firstWindow = iter.next();
	//	System.out.println("1st Wind id: " + firstWindow);
		
		String secondWindow = iter.next();
	//	System.out.println("2nd Wind id: " + secondWindow);
		
		driver.switchTo().window(secondWindow);
	//	System.out.println("2nd window URL: " + driver.getCurrentUrl());
		
		
		driver.findElement(buy).click();
		return this;
		
	}
	
	private LandingPage fillDetails(String val)
	{
		driver.findElement(details).sendKeys(val);
		return this;
	}
	
	private LandingPage pressToContinue()
	{
		driver.findElement(Continue).click();
		return this;
	}
	
	private LandingPage enterPassword(String pw)
	{
		driver.findElement(password).sendKeys(pw);
		return this;
	}
	
	private LandingPage clickButton()
	{
		driver.findElement(clBtn).click();
		return this;
	}
	
	public CheckOutPage actionOnLanding(String val, String pw)
	{
		selectPhone().buyItem().fillDetails(val).pressToContinue().enterPassword(pw).clickButton();
		return new CheckOutPage(driver);
	}
	
}
