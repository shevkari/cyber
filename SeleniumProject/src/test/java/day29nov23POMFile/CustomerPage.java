package day29nov23POMFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage {

	WebDriver driver;
	
	CustomerPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By firstName	= By.name("firstName");
	By middleName	= By.name("middleName");
	By lastName		= By.name("lastName");
	By btnSave		= By.xpath("//button[@type='submit']");
	
	private final CustomerPage enterFirstName(String fn)
	{
		driver.findElement(firstName).sendKeys(fn);
		return new CustomerPage(driver);
	}
	
	private final CustomerPage enterMiddleName(String mn)
	{
		driver.findElement(middleName).sendKeys(mn);
		return new CustomerPage(driver);
	}
	
	private final CustomerPage enterLastName(String ln)
	{
		driver.findElement(lastName).sendKeys(ln);
		return new CustomerPage(driver);
	}

	private final CustomerPage clickAddBtn()
	{
		driver.findElement(btnSave).click();
		return this;
	}
	
	public void addCustomerDetails() throws InterruptedException
	{
		enterFirstName("FN_"+System.currentTimeMillis());
		enterMiddleName("MN_"+System.currentTimeMillis());
		enterLastName("LN_"+System.currentTimeMillis());
		Thread.sleep(4000);
		clickAddBtn();
	}
}
