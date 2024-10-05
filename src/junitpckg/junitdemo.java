package junitpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");
	}
	@Test
	public void titleverification()
	{
		String actualTitle = driver.getTitle();
		String expectTitle= "Google";
		if(actualTitle.equals(expectTitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	@Test
	public void textverification()
	{
		String src= driver.getPageSource();
		if(src.contains("Image"))
		{
			System.out.println("test verified");
		}
		else
		{
			System.out.println("not verified");
		}
	}
	@After
	public void tearDown()
	{
		driver.close();
	}
	

}
