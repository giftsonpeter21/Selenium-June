package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerprgrm {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.com");
	}
	@Test
	public void datepicker()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[2]")).click();
	    datepicker("November 2024","24");
	}
	public void datepicker(String Expmonth,String expdate)
	{
		while(true)
		{
			WebElement monthdetails=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
			String month=monthdetails.getText();
			if(Expmonth.equals(month))
			{
				System.out.println(month);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			}
		}
		
	   List<WebElement>datelist=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
	 
	  for(WebElement ele:datelist)	
	  {
		  String date=ele.getText();
		  if(date.equals(expdate))
		  {
			 ele.click();
			 break;
		  }
	  }
	}

}
