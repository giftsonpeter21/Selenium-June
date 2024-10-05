package junitpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathFb {
 ChromeDriver driver;
 @Before
 public void setup()
 {
	 driver= new ChromeDriver();
	 driver.get("https://www.facebook.com");
 }
 @Test
public void fb()
{
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("peter@gmail.com");
	 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("0133665jij");
	 driver.findElement(By.name("login")).click();
}
 @After
 public void close()
 {
	 driver.close();
 }

}
