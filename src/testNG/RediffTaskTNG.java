package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RediffTaskTNG {

	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void logo()
	{
		WebElement logo=driver.findElement(By.xpath("//div[@id='wrapper']/table/tbody/tr/td/img"));
		boolean l=logo.isDisplayed();
		if(l)
		{
			System.out.println("is present");
		}
		else
		{
			System.out.println("not present");
		}
	}
	@Test
	public void Rbutton()
	{
		WebElement Rbutton=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]"));
		boolean b=Rbutton.isSelected();
		if(b)
		{
			System.out.println("is selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}
	@Test
	public void button()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		boolean s=button.isEnabled();
		if(s)
		{
			System.out.println("is enable");
		}
		else
		{
			System.out.println("not enable");
		}
		
	}
	


}
