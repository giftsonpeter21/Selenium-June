package junitpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownRediff2 {
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
		WebElement dayele= driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select day= new Select(dayele);
		day.selectByValue("31");
		
		WebElement monthele= driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select month= new Select(monthele);
		month.selectByValue("JUN");
		
		WebElement yearele= driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select year= new Select(yearele);
		year.selectByValue("1999");
	 }

}
