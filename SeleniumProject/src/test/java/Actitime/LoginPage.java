package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By txtUN = By.name("username");
	By txtPWD= By.name("pwd");
	By btn   = By.id("loginButton");
	
	
	private LoginPage enterUN(String UN)
	{
		driver.findElement(txtUN).sendKeys(UN);
		return this;
	}
	
	private LoginPage enterPWD(String PWD)
	{
		driver.findElement(txtPWD).sendKeys(PWD);
		return this;
	}
	
	private LoginPage pressEnter()
	{
		driver.findElement(btn).click();
		return this;
	}
	
	public LandingPage performAction(String UN, String PWD)
	{
		enterUN(UN).enterPWD(PWD).pressEnter();
		return new LandingPage(driver);
	}

}
