package day20nov23ExtendReportShadowEle;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportDemo {

	public static void main(String[] args) {

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/src/test/resources"+"/ABC"+".html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	//	System.out.println(System.getProperty("user.dir"));
		
		
		ExtentTest test1 = extent.createTest("Smoke","Sanity");
		test1.assignCategory("ss","dd","ff");
		test1.assignAuthor("A","B");
		test1.info("Login");
		test1.info("Success");
		test1.pass("Successfully Login");
		test1.fail("Unable to logout");
		//test1.getStatus();
		
		
		extent.flush();
	}

}
