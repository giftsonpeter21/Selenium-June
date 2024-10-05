package junitpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpage {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/gifts/Desktop/alertpage.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert(); //alert handling 
		String alertText=a.getText();
		System.out.println(alertText);
		a.accept(); //for yes
		//a.dismiss(); for no
		driver.findElement(By.name("firstname")).sendKeys("Giftson");
		driver.findElement(By.name("lastname")).sendKeys("Peter");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	

}
