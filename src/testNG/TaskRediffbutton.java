package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TaskRediffbutton {
	
	String url="https://register.rediff.com/register/register.php?FormName=user_details";
    ChromeDriver driver;
    @BeforeTest
    public void setup()
    {
    	driver=new ChromeDriver();
    	driver.get(url);
    }
    @Test
    public void test()
    {
    	WebElement Fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement ReddifId=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		Fullname.sendKeys("Peter");
		ReddifId.sendKeys("Peter");
		Actions act=new Actions(driver);
		button.click();
		
		act.perform();
    }
    
}
