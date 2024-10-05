package testpckg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepckg1.Fbloginpage;

public class Fblogintest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setValues("Peter@gmail.com","peter123");
		ob.loginclick();
	}

}
