package junitpckg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerbalsiteTask {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void Title()
	{
		String actualtitle= driver.getTitle(); //title check
        String expttitle="RishiHerbal";
        if(actualtitle.equals(expttitle))
        {
           System.out.println("pass");
        }
       else
       {
            System.out.println("fail");
       }
	
		List<WebElement>li=driver.findElements(By.tagName("a")); //link counts and size
		if(li.size()==100)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println("Total number of links = "+li.size());
		
		
		String src=driver.getPageSource(); // food text present
		if(src.contains("Food"))
		{
			System.out.println("is present");
		}
		else
		{
			System.out.println("not present");
		}
		
		driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a")).click();
	}
	

}
