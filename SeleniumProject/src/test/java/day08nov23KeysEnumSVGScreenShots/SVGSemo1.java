package day08nov23KeysEnumSVGScreenShots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGSemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://sajithatharaka.github.io/svg-automation/");
		driver.manage().window().maximize();
		
		WebElement circle = driver.findElement(By.xpath("//*[name()='svg']//*[name()='circle']"));
	
		System.out.println(circle.getAttribute("cx"));
		System.out.println(circle.getAttribute("cy"));
		System.out.println(circle.getAttribute("r"));
		System.out.println(circle.getAttribute("stroke"));
		System.out.println(circle.getAttribute("stroke-width"));
		System.out.println(circle.getAttribute("fill"));

		System.out.println();
		
		WebElement rectangle = driver.findElement(By.xpath("//*[name()='svg']//*[@id='rectangle']"));
		
		System.out.println(rectangle.getAttribute("width"));
		System.out.println(rectangle.getAttribute("height"));
		System.out.println(rectangle.getAttribute("style"));


		WebElement text = driver.findElement(By.xpath("//*[name()='svg']//*[name()='text']"));
		
		System.out.println(text.getAttribute("x"));
		System.out.println(text.getAttribute("y"));
		System.out.println(text.getAttribute("fill"));
		System.out.println(text.getAttribute("textContent"));
		System.out.println(text.getAttribute("innerHTML"));
		System.out.println(text.getText());


	}

}
