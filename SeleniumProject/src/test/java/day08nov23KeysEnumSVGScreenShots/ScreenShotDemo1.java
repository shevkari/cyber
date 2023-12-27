package day08nov23KeysEnumSVGScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotDemo1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		driver = new ChromeDriver();
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);", "");
		
		String filename = new Date().toString().replaceAll(" ", "_").replaceAll(":", "_")+".jpg";
		
		captureScreenShot(System.getProperty("user.dir")+"/src/test/resources/FullPageScreeShot_"+filename);
				
				driver.close();
	}

	public static void captureScreenShot(String filename) throws IOException
	{
		Screenshot screenShot  = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenShot.getImage(), "png", new File(filename));
	}
	
}
