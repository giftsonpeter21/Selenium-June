package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsPrgrm {
	WebDriver driver;
	String url="https://www.facebook.com";
	ExtentSparkReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beforetest()
	{
		reporter = new ExtentSparkReporter("./Reports/myReport1.html");
		reporter.config().setDocumentTitle("AutomationReport");
		reporter.config().setReportName("functional Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows11");
		extent.setSystemInfo("testername", "abc");
		extent.setSystemInfo("Browsername", "Chrome");
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void Setup()
	{
		driver.get(url);
	}
	
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("fbtitleverification");
		String exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(exp,actual);
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		 if(result.getStatus()==ITestResult.FAILURE)
		 {
			 test.log(Status.FAIL,"testcase failed is "+result.getName());
			 test.log(Status.FAIL,"testcase failed is "+result.getThrowable());
			 
			 String Screenshotpath=screenshotMethod(driver,result.getName());
			 test.addScreenCaptureFromPath(Screenshotpath);  
		 }
		 else if(result.getStatus()==ITestResult.SKIP)
		 {
			test.log(Status.SKIP,"testcase skipped is"+result.getName());
		 }
		 else  if(result.getStatus()==ITestResult.SUCCESS)
		 {
			 test.log(Status.PASS,"testcase passed is"+result.getName());
		 }
	}
	
	public static String screenshotMethod(WebDriver driver, String Screenshotname) throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="./Screenshot/"+Screenshotname +".jpeg";
		FileHandler.copy(src, new File(destination));
	
		return destination;
	}
	
	
	

}
