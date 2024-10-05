package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TASK99 {
   ChromeDriver driver;
   @BeforeTest
   public void setup()
   {
	   driver=new ChromeDriver();
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
   }
   @Test
   public void country()
   {
	 WebElement drop= driver.findElement(By.id("country"));
	 
	 Select select= new Select(drop);
	 
	 
	 List<WebElement> options = select.getOptions();
	  
	 for (WebElement op:options) //for each
	  {
        System.out.println(op.getText());
	  }
	 
	   
   }

}
