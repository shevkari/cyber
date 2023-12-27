package day21oct23;



	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class XYZ {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.letskodeit.com/practice");
			driver.manage().window().maximize();
	 
			
			WebElement radioBtnBmw = driver.findElement(By.id("bmwradio"));
			if (radioBtnBmw.isSelected())
				System.out.println("BMW radio button is already selected ....");
			else
				System.out.println("BMW radio button is NOT selected ....");
			radioBtnBmw.click();
			
			String valueAttribute = radioBtnBmw.getAttribute("value");
			System.out.println("value: " + valueAttribute);
			String nameAttribute = radioBtnBmw.getAttribute("name");
			System.out.println("name : " + nameAttribute);
			String typeAttribute = radioBtnBmw.getAttribute("type");
			System.out.println("type : " + typeAttribute);
			
			Thread.sleep(4000l);
			System.out.println("---------------------------");

			WebElement radioBtnBenz = driver.findElement(By.id("benzradio"));
			radioBtnBenz.click();
			if (radioBtnBenz.isSelected())
				System.out.println("Benz radio button is already selected ....");
			else
				System.out.println("Benz radio button is NOT selected ....");
				
			valueAttribute = radioBtnBenz.getAttribute("value");
			System.out.println("value: " + valueAttribute);
			nameAttribute = radioBtnBenz.getAttribute("name");
			System.out.println("name : " + nameAttribute);
			typeAttribute = radioBtnBenz.getAttribute("type");
			System.out.println("type : " + typeAttribute);
			
			System.out.println("---------------------------");
			Thread.sleep(4000l);
			WebElement  radioBtnHonda = driver.findElement(By.id("hondaradio"));
			radioBtnHonda.click(); 
			if (radioBtnHonda.isSelected())
				System.out.println("Honda radio button is already selected ....");
			else
				System.out.println("Honda radio button is NOT selected ....");
			
			valueAttribute = radioBtnHonda.getAttribute("value");
			System.out.println("value: " + valueAttribute);
			nameAttribute = radioBtnHonda.getAttribute("name");
			System.out.println("name : " + nameAttribute);
			typeAttribute = radioBtnHonda.getAttribute("type");
			System.out.println("type : " + typeAttribute);
			
			
			// will not be able to use as it is giving us 7 elements instead of 3
//			List<WebElement> loRadioBtns  =  driver.findElements(By.name("cars"));
//			System.out.println(loRadioBtns.size());  // 7 elements
			
			
		
	}
	
	
}
