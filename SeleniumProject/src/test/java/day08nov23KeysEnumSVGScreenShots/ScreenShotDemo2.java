package day08nov23KeysEnumSVGScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo2 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400);", "");
		
		String destFile = System.getProperty("user.dir")+"/src/test/resources/scripterror_";
		
		File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // BYTE, BASE64, FILE
		captureScreenShot(destFile, sourcefile);
		driver.close();
	}

	static void captureScreenShot(String DestFile, File SourceFile) throws IOException
	{
		Date dt = new Date();
		DestFile= DestFile + dt.toString().replaceAll(" ", "_").replaceAll(":", "_")+ ".jpg";
		System.out.println("destFile : " + DestFile);
		FileUtils.copyFile(SourceFile, new File(DestFile));
	}
}

