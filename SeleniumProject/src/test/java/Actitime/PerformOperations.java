package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformOperations {
	
	WebDriver driver;
	
	PerformOperations(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By addUser = By.xpath("(//span[@unselectable='on'])[1]");
	
	
	private PerformOperations clickUser()
	{
		driver.findElement(addUser).click();
		return this;
	}
	
	public AddUserPage userDetails()
	{
		clickUser();
		return new AddUserPage(driver);
	}
	
	
	
	
	

}
