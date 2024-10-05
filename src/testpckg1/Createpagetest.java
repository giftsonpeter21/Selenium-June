package testpckg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepckg1.Createpage;

public class Createpagetest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test2() throws Exception
	{
		Createpage ob=new Createpage(driver);
		ob.Createpageclick();
		ob.textverification();
		Thread.sleep(1000);
		ob.signupclick();
	}

}
