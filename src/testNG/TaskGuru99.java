package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TaskGuru99 {
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		WebElement rightclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement editclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		WebElement doubleclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(driver);
		act.contextClick(rightclk).perform();
		editclk.click();
		driver.switchTo().alert().accept();
		act.doubleClick(doubleclk).perform();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
    }
	

}
