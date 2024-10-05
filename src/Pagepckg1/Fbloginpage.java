package Pagepckg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	
	WebDriver driver;
	
	By Fbmail=By.id("email");
	By Fbpswd=By.id("pass");
	By Fblogbutton=By.name("login"); 
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setValues(String email,String pswd)
	{
		driver.findElement(Fbmail).sendKeys(email);
		driver.findElement(Fbpswd).sendKeys(pswd);
	}
	
	public void loginclick()
	{
		driver.findElement(Fblogbutton).click();
	}
	

}
