package junitpckg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotprgrm {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/gifts/Desktop/alertpage.html");
	}
	@Test
	public void alertt() throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //for page screenshot
		FileHandler.copy(src,new File("D://alertSS.png"));
		
		WebElement ele= driver.findElement(By.xpath("/html/body/input[1]")); //for element screenshot
		File src1=ele.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshot/buttonSS.png"));
	}

}  
