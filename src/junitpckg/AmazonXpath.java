package junitpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https:/www.amazon.in");
	}
	@Test
	public void amazon()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[1]")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[9]")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-main']/div/a/i")).click();
	}
	@After
	public void close()
	{
		driver.close();
	}
	

}
