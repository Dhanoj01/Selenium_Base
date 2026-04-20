package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//isDisplayed
	    WebElement button = driver.findElement(By.xpath("//button[@class=\"start\"]"));
	    boolean status = button.isDisplayed();
	    System.out.println("button Displayed : "+status);
		
		//isEnabled
	    boolean inputStatus = driver.findElement(By.id("name")).isEnabled();
	    System.out.println("Input box is Enabled : "+ inputStatus);
	   
		//isSelected
	    WebElement maleRadio = driver.findElement(By.id("male"));   // ✅ actual radio button
	    WebElement femaleRadio = driver.findElement(By.id("female"));
	    
	    maleRadio.click();
	    
	    System.out.println("Is Male Radio Btn Selected : "+ maleRadio.isSelected());
	    System.out.println("Is Female Radio Btn Selected : "+ femaleRadio.isSelected());

		driver.quit();
	}
}