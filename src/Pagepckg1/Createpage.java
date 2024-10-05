package Pagepckg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createpage {
	
	WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement Fbcreatepage;
	
	@FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement Fbsignup;
	
	public Createpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Createpageclick()
	{
		Fbcreatepage.click();
	}
	
	public void textverification()
	{
		String src=driver.getPageSource();
		if(src.contains("Create a Page"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	public void signupclick()
	{
		Fbsignup.click();
	}

}
