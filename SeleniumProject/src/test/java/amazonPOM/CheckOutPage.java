package amazonPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	WebDriver driver;
	
	CheckOutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By txtLabel = By.xpath("//h1");
	
	public String getLabel()
	{
		return driver.findElement(txtLabel).getText();
	}

}
