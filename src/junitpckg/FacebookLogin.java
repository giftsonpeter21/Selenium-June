package junitpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fb()
	{
		driver.findElement(By.id("email")).sendKeys("peter@gmail.com"); //emialid or username 
		driver.findElement(By.id("pass")).sendKeys("peter@00685"); //password
		driver.findElement(By.name("login")).click(); //Login button
	}
	@After
	public void closefb()
	{
		driver.quit();
	}
	

}
