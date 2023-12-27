package amazonPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	WebDriver driver;

	HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By txtBox = By.id("twotabsearchtextbox");
	By btnSearch = By.xpath("(//input[@type='submit'])[1]");
	
	private HomePage searchItem(String str)
	{
		driver.findElement(txtBox).sendKeys(str);
		return this;
	}
	
	private HomePage pressEnter()
	{
		driver.findElement(btnSearch).click();
		return this;
	}
	
	public LandingPage loginAction(String str)
	{
		searchItem(str).pressEnter();
		return new LandingPage(driver);
		
	}
	
	
}
