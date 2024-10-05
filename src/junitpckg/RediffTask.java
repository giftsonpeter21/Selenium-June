package junitpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffTask {
	 ChromeDriver driver;
	 @Before
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	 
	 @Test
	 public void Rediff()
	 {
		 WebElement dE = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		 Select drop = new Select(dE);
		 drop.selectByVisibleText("21");
		 
		 WebElement dE1 = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		 Select drop1 = new Select(dE1);
		 drop1.selectByVisibleText("FEB");
		 
		 WebElement dE2 = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		 Select drop2 = new Select(dE2);
		 drop2.selectByVisibleText("1999");
	 }
	 @After
	 public void close()
	 {
		 driver.quit();
	 }
	 

}
