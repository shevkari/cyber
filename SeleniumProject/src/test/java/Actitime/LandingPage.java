package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By txtLabel = By.id("profile-link");
	private By labelUser = By.xpath("(//div[@class='label'])[4]");
	
	public String getLabel()
	{
		return driver.findElement(txtLabel).getText();
	}
	
	private /*AddUserPage*/ LandingPage clickUser()
	{
		driver.findElement(labelUser).click();
		//return new AddUserPage(driver);
		return this;
	}
	
	public PerformOperations actionsOnLandingPage()
	{
		clickUser();
		return new PerformOperations(driver);
		
	}

}
