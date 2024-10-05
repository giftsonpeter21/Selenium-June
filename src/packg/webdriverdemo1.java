package packg;

import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverdemo1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();//open browser
		driver.get("https://www.google.com"); //open google
		
		String actualtitle= driver.getTitle(); //to check the title
        String explite="Google";
        if(actualtitle.equals(explite))
          {
             System.out.println("pass");
          }
         else
         {
              System.out.println("fail");
         }
        
        driver.close(); //to close the current tab
        //driver.quite();// to quit browser 
        
        

	}

}
