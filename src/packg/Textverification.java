package packg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		
		String src=driver.getPageSource();
		if(src.contains("Images"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
        driver.close();
        
	}

}
