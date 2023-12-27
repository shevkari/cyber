package day29nov23POMFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	WebDriver driver;
	LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By txtdashboard = By.xpath("//h6");
	By txtPIM		= By.xpath("(//span)[2]");
	By btnAdd		= By.xpath("(//button[@type='button'])[4]");

	
	public String getText()
	{
		return driver.findElement(txtdashboard).getText();
		
	}

	public LandingPage clickOnPIM()
	{
		driver.findElement(txtPIM).click();
		return this;
//		return new LandingPage(driver);
	}
	
	public CustomerPage clickAddButton()
	{
		driver.findElement(btnAdd).click();
		return new CustomerPage(driver);
	}
	
	
	
	
}
