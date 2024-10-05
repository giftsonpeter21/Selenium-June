package junitpckg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkcountTagname {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links = "+li.size());
		
		for(WebElement elm:li)
		{
			String s=elm.getAttribute("href");
			String s1=elm.getText();
			System.out.println(s+"-----------------"+s1);
		}
	}
	@After
	public void close()
	{
		driver.quit();
	}
     
}
