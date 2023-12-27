package Actitime;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatedUserPage {

	WebDriver driver;
	
	CreatedUserPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By userList = By.xpath("//td[@class='listtblcell userNameTableCell userWithGroupCell']");
	
	public List<String> listOfUser()
	{
		List<WebElement> ele = driver.findElements(userList);
	//	ele.forEach(x->System.out.println(x.getText()));
	//	return this;
		String str = null;
		List<String> list = null;
		for(WebElement el  : ele)
		{
			for(int i=4; i<ele.size(); i++)
			{
				
			str =el.getText();
		list = new ArrayList<>();
		list.add(str);
			}
		}
		
		return list;
	}
}
