package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TaskAmazonWindowHandle {
	WebDriver d;
	@BeforeTest
	public void beforetest()
	{
		d=new ChromeDriver();
		
	}
	@Test
	public void amazon()
	{
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobilephones",Keys.ENTER);
		String actualTitle =d.getTitle();
		String expTitle = "Amazon.in : mobilephones";
		Assert.assertEquals(actualTitle,expTitle,"Title Verified");
	}
	
	@Test
	public void frstphone()
	{
		d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		String orgwindow=d.getWindowHandle();
        Set<String> allWindowHandles =d.getWindowHandles();
		
		for(String Handle : allWindowHandles)
		{
			if(!Handle.equalsIgnoreCase(orgwindow))
			{
				d.switchTo().window(Handle);
				d.findElement(By.xpath("//*[@id=\"productTitle\"]"));
			}
		}
	}
		@Test
		public void cart(String orgwindow)
		{
	
		   JavascriptExecutor js = (JavascriptExecutor)d; //scroll down and add to cart
		   js.executeScript("window.scrollBy(0,500)");
	           
		   WebElement addcart = d.findElement(By.id("//*[@id=\"add-to-cart-button\"]"));
		   addcart.click();
		
	       d.switchTo().window(orgwindow); // Switch back to the original window
	       WebElement cart = d.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]"));
	       cart.click();
		
	}

	

}
