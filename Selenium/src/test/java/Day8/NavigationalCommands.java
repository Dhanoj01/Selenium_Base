package Day8;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//1.get
		driver.get("https://demo.nopcommerce.com/");
	
		//2. navigate().to()
		
		//URL myurl = new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myurl);
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		//3. navigate().back()
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		
		//4. navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		
		//5. navigate().refresh()
		driver.navigate().refresh();
	}
}
