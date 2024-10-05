package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandler {
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
    
	@Test
	public void test() throws Exception
	{
		driver.get("http://demo.guru99.com/popup.php");
		String parentwindow = driver.getWindowHandle(); //cuurent window details
		
		System.out.println("Parent window title--------"+ driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowHandles =driver.getWindowHandles();
		
		for(String Handle : allWindowHandles)
		{
			if(!Handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(Handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("peterman@gmai.com");
				Thread.sleep(3000);
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
	}

}
