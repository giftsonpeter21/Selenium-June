package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookTestng {
    ChromeDriver driver;
     
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Parameters({"e","p"})
	@Test
	public void username(String e,String p)
	{
		driver.findElement(By.name("email")).sendKeys(e);
		driver.findElement(By.name("pass")).sendKeys(p);
		driver.findElement(By.name("login")).click();
	}

}
