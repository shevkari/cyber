package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage {

	WebDriver driver;
	
	AddUserPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By userName= By.name("username");
	private By password = By.name("passwordText");
	private By retypePWD = By.name("passwordTextRetype");
	
	private By firstName = By.name("firstName");
	private By middleName = By.name("middleName");
	private By lastName = By.name("lastName");
	private By mail = By.name("email");
	private By btncreateuser = By.cssSelector("input[type='submit']");
	
	
	
	private AddUserPage enterUser(String UN) 
	{
		
		driver.findElement(userName).sendKeys(UN);
		return this;
	}
	
	private AddUserPage enterpassword(String PWD) 
	{
		driver.findElement(password).sendKeys(PWD);
		return this;
	}
	
	private AddUserPage reEntePassword(String rPWD) 
	{
		driver.findElement(retypePWD).sendKeys(rPWD);
		return this;
	}
	
	private AddUserPage enterUserFN(String FN) 
	{
		driver.findElement(firstName).sendKeys(FN);
		return this;
	}
	
	private AddUserPage enterUserMN(String MN) 
	{
		driver.findElement(middleName).sendKeys(MN);
		return this;
	}
	
	private AddUserPage enterUserLN(String LN) 
	{
		driver.findElement(lastName).sendKeys(LN);
		return this;
	}
	
	private AddUserPage enterUserEmail(String email) 
	{
		driver.findElement(mail).sendKeys(email);
		return this;
	}
	
	private AddUserPage clickBtn() 
	{
		driver.findElement(btncreateuser).click();
		return this;
	}
	
	
	public CreatedUserPage enterUserDetails(String UN, String PWD, String rPWD,String FN, String MN, String LN, String mail) 
	{
		enterUser(UN).enterpassword(PWD).reEntePassword(rPWD).enterUserFN(FN).enterUserMN(MN).enterUserLN(LN).enterUserEmail(mail).clickBtn();
		return new CreatedUserPage(driver);
	}
}
