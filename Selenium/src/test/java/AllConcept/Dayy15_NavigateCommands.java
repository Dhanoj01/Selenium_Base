package AllConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayy15_NavigateCommands {

	public static void main(String args[])
	{
		
		WebDriver  driver = new ChromeDriver();
		
		
		//get
		driver.get("https://www.google.com/");
		
		
		//navigate.to()
		driver.navigate().to("https://facebook.com/");
		
		//navigate.back()
		driver.navigate().back();
		
		//navigate.forward()
		driver.navigate().forward();
		
		//navigate.refresh()
		driver.navigate().refresh();
		
		System.out.println("all set and Done");
		
		driver.quit();
	}
}
