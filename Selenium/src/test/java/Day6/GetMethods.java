package Day6;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//getURL()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle()
		System.out.println(driver.getTitle());
		
		//getCurrentUrl()
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url : "+ currentUrl);
		
		//getPageSource()
		System.out.println("Page Source : "+ driver.getPageSource());
		
		//getWindowHandle()
		String windowId = driver.getWindowHandle();
		System.out.println("Window handle : "+ windowId);
		
		//getWindowHandles()
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> Ids =  driver.getWindowHandles();
		System.out.println("Window Handle Ids : "+ Ids);
		
		
	}
}
