package testNG;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JanasyaTask {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://janasya.com/");
	}
	@Test
	public void title()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Janasya";
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Title Verified");
		}
		else
		{
			System.out.println("Title not Verified");
		}	
	}
	@Test
	public void links()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		if(li.size()==400)
		{
			System.out.println("no.of links 400");
		}
		else
		{
			System.out.println("no.of links not 400");
		}
	   System.out.println("Total number of links = "+li.size());
		
	}
	@Test
	public void Screenshot() throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		FileHandler.copy(src,new File("C:\\Users\\gifts\\Pictures\\Screenshots\\Screenshot 2024-09-19 122525.png"));
	}

}
