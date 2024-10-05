package junitpckg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleResponseCode {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test() throws Exception, IOException
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links = "+li.size());
		
		for(WebElement elm:li)
		{
			String link=elm.getAttribute("href");
			verifylink(link);
		}
    }
	private void verifylink(String link) throws MalformedURLException, IOException 
	{
		try {
			URI ob=new URI(link);
			HttpURLConnection c=(HttpURLConnection)ob.toURL().openConnection();
			if(c.getResponseCode()==200)
			{
				System.out.println("succesfull response code 200 "+link);
			}
			else if(c.getResponseCode()==400)
			{
				System.out.println("Broken link code 400 "+link);
			}
		} catch (Exception e) {
			
                System.out.println(e.getMessage());
		}
		
		
	}
	

}

