package day21nov23AutoITTestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		Runtime.getRuntime().exec("D:\\AUTOIT\\FILE.exe");	
		
	//admin	admin
		Thread.sleep(10000);
		driver.quit();
	}

}
