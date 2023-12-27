package day26oct23NavigateToFindElementsRadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsDemo {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.letskodeit.com/practice";
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		driver.findElement(By.id("bmwradio")).click();
		Thread.sleep(3000l);
		
		driver.findElement(By.id("benzradio")).click();
		Thread.sleep(3000l);
		
		driver.findElement(By.id("hondaradio")).click();
		Thread.sleep(3000l);
		
		
		boolean isSelectedradiobmw = driver.findElement(By.id("bmwradio")).isSelected();
		System.out.println(isSelectedradiobmw);
		
		boolean isSelectedradiobenz = driver.findElement(By.id("benzradio")).isSelected();
		System.out.println(isSelectedradiobenz);
		
		boolean isSelectedradiohonda = driver.findElement(By.id("hondaradio")).isSelected();
		System.out.println(isSelectedradiohonda);
		
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		//element.findElement(By.id("Apple")).click();
		//Thread.sleep(3000l);
	//	element.findElement(By.id("Orange")).click();
		//WebElement element = driver.findElement(By.id("Applemultiple"));
		element.click();
		
	//	WebElement element = driver.findElement(By.id("multiple-select-example"));
		
		driver.findElement(By.id("carselect")).click();
		Thread.sleep(3000l);
		
		driver.findElement(By.name("bmw")).click();
		Thread.sleep(3000l);
		
		driver.findElement(By.id("hondacarselect")).click();
		Thread.sleep(3000l);
		
	
	}

}
