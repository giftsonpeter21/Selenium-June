package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class autoitprgrm {
	WebDriver driver;
	   @BeforeTest
	   public void setup()
	   {
		   driver=new ChromeDriver();
		  
	   }
	   @SuppressWarnings("deprecation")
	@Test
	   public void main() throws Exception
	   {
		    driver.get("https://www.ilovepdf.com/word_to_pdf");
		    driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("D:\\Software Testing\\T1.exe");
			Thread.sleep(3000);
	   
	   }
}
