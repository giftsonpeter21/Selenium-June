package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDropPrgrm {
	
	String Baseurl="https://demo.guru99.com/test/drag_drop.html";
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);
	}
	@Test
	public void Test()
	{
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement cash=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement accnt1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement amnt1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement accnt2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement amnt2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(bank,accnt1).build().perform();
		act.dragAndDrop(cash,amnt1).build().perform();
		act.dragAndDrop(sales,accnt2).build().perform();
		act.dragAndDrop(cash,amnt2).build().perform();
		
		WebElement pb=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
         
		if(pb.getText().equals("Perfect!"))
		{
			System.out.println("Perfect is displayed");
		}
		else
		{
			System.out.println("Perfect is not displayed");
		}
		 
	}

}
