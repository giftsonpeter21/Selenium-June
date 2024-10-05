package junitpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleprgrm {
	
	ChromeDriver driver;
	@Before 
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");
	}
	@Test
	public void google()
	{
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("Luminar Technolab",Keys.ENTER); //keys.ENTER is for search button
	    // searchfield.submit();
		//driver.findElement(By.name("btnK")).click();
		
	}
	

}
