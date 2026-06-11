package AllConcept;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayy17_BrowserWindowSize {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	    //Get Current size
		System.out.println(driver.manage().window().getSize());		//1200,817
		
		//wait
		Thread.sleep(3000);
		
		//Dimension
		Dimension d = new Dimension(1500,861);
		
		//set
		driver.manage().window().setSize(d);
		
		//new Dimension
		System.out.println(driver.manage().window().getSize());		//1500,861
		
		driver.quit();

	}

}
