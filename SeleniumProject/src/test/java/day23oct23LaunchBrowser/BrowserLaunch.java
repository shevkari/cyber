package day23oct23LaunchBrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		Properties prop = new Properties();
		WebDriver driver = null;
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/day23oct23LaunchBrowser/config.properties");
			prop.load(fis);
			System.out.println(System.getProperty("user.dir"));
			
		
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String	browser  = prop.getProperty("browser").trim();
	extracted(browser, driver);
	System.out.println(browser);
	}
	

	private static void extracted(String browser, WebDriver driver) {
		
			if(browser.equalsIgnoreCase("chrome"))
					{
				driver = new ChromeDriver();
				driver.get("https://www.google.com");
			}
			
			else if (browser.equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver();
				driver.get("https://www.google.com");
			}
			
			else if (browser.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
				driver.get("https://www.google.com");
			}
			
			else System.out.println("Wrong Input browser");
			try {
				Thread.sleep(10000l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.close();
	}


}
