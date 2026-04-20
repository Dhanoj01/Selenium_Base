package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	
	
	public static void main(String args[]) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(3000);
		
		driver.close();  //it closes the single window where the driver is generally focused 
		
		driver.quit();   //it forcefully close all the windows tab which are open in the browser.
		
		
	}
}
