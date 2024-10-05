package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbloginValidation {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.name("email")).sendKeys("peter@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("peter");
		driver.findElement(By.name("login")).click();
		String expurl="https://www.facebook.com/profile";
		String acturl=driver.getCurrentUrl();
		if(expurl.equals(acturl))
		{
			System.out.println("successful");
		}
		else
		{
			System.out.println("not successful");
		}
	}

}
