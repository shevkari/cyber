package day26oct23NavigateToFindElementsRadioButtons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookmyshowDemo {

	public static void main(String[] args) {

		String url = "https://www.bookmyshow.com";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
	
	}

}
