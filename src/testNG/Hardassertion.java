package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassertion {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void title()
	{
		driver.get("https://www.google.com");
		String Actualtitle=driver.getTitle();
		String ExpTitle="Google";
		System.out.println("Title----"+Actualtitle);
		Assert.assertEquals(Actualtitle,ExpTitle,"Title Verified");
		System.out.println("verified");
	}

}
