package day29nov23POMFile;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	// Constructor
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	// Locators / Instance Variables
	
	By txtUserName = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin	   = By.xpath("//button[@type='submit']");
	
	
	//Methods
	
	public LoginPage enterUserName(String un)
	{
		driver.findElement(txtUserName).sendKeys(un);
		return this;
	}
	
	public LoginPage enterPassword(String pw)
	{
		driver.findElement(txtPassword).sendKeys(pw);
		return this;
	}
	
	public LandingPage clickBtn()
	{
		driver.findElement(btnLogin).click();
		return new LandingPage(driver);
	}

}
								// 9923259776 - painter